package checkquize15;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.board.common.DAO;
import com.board.model.BoardDB;

public class BoardDao {
	Connection conn =null;
	ResultSet rs = null;
	PreparedStatement pstmt = null;
	
	public static Connection getConnect() {
		Connection conn = null;
		String user = "kimbob";
		String passwd = "kimbob";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";

		try {
			Class.forName(driver);

			conn = DriverManager.getConnection(url, user, passwd);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	//전체글조회
	public List<Board> getBoardList() {
		Board board = new Board();
		conn = BoardDao.getConnect();
		String sql = "select * from boards2";
		List<Board> list = new ArrayList<>();
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				board = new Board(rs.getString("title"), rs.getString("content"));
			
				list.add(board);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return list;

	}
}
