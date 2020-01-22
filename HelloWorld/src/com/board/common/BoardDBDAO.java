package com.board.common;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.board.model.BoardDB;

public class BoardDBDAO {
	Connection conn = null;
	ResultSet rs = null;
	PreparedStatement pstmt = null;
	String name = null;

	// 댓글 있는지 확인 매소드
	public boolean checkForReply(int boardNo) {
		conn = DAO.getConnect();
		String sql = "select count(*) as cnt from boards" + " where orig_no =?";
		int cnt = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, boardNo);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				cnt = rs.getInt("cnt");
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
		if (cnt > 0)
			return false;
		else
			return true;
	}

	// 권한체크
	public boolean checkResponsibility(BoardDB board) {
		conn = DAO.getConnect();
		String sql = "select count(*) as cnt from boards " + "where orig_no is null and board_no=? " + "and writer=?";
		int result = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, board.getBoardNo());
			pstmt.setString(2, board.getWriter());
			rs = pstmt.executeQuery();
			if (rs.next()) {
				result = rs.getInt("cnt");
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
		if (result > 0)
			return true;
		else
			return false;
	}

	public void updateBoard(BoardDB board) {
		conn = DAO.getConnect();
		String sql = "update boards set orig_no=orig_no";
		if (board.getTitle() != null && !board.getTitle().equals("")) {
			sql += " ,title=?";
		}
		if (board.getContent() != null && !board.getContent().equals("")) {
			sql += ",content=?";
		}

		sql += " where orig_no is null and board_no=?";

		System.out.println(sql);
		int n = 0;

		try {
			pstmt = conn.prepareStatement(sql);

			if (board.getTitle() != null && !board.getTitle().equals("")) {
				// System.out.println(board.getTitle());
				pstmt.setString(++n, board.getTitle());
			}
			if (board.getContent() != null && !board.getContent().equals("")) {
				// System.out.println(board.getContent());
				pstmt.setString(++n, board.getContent());
			}
			pstmt.setInt(++n, board.getBoardNo());

			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	// 게시글 조회(댓글포함)
	public List<BoardDB> getReplyList(int boarNo) {
		conn = DAO.getConnect();
		String sql = "select * from boards where orig_no = " + boarNo;
		List<BoardDB> list = new ArrayList<>();
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				BoardDB board = new BoardDB();
				board = new BoardDB();
				board.setBoardNo(rs.getInt("board_no"));
				board.setTitle(rs.getString("title"));
				board.setContent(rs.getString("content"));
				board.setWriter(rs.getString("writer"));
				board.setCreationDate(rs.getString("creation_date"));
				board.setOrigNo(rs.getInt("orig_no"));
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

	// 게시물 조회(댓글 포함 X)
	public BoardDB getBoard(int boarNo) {
		BoardDB board = new BoardDB();
		conn = DAO.getConnect();
		String sql = "select * from boards where board_no = ? and orig_no is null";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, boarNo);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				board = new BoardDB();
				board.setBoardNo(rs.getInt("board_no"));
				board.setTitle(rs.getString("title"));
				board.setContent(rs.getString("content"));
				board.setWriter(rs.getString("writer"));
				board.setCreationDate(rs.getString("creation_date"));
				board.setOrigNo(rs.getInt("orig_no"));

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

		return board;
	}

	// 로그인 확인
	public String getUserName(String id, String pass) {// user id,password check;
		conn = DAO.getConnect();
		String sql = "select * from user_login where id= ? and passwd=?";
		try {
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, id);
			pstmt.setString(2, pass);

			rs = pstmt.executeQuery();
			if (rs.next()) {
				name = rs.getString("name");
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return name;
	}

	// 데이터추가
	public void insertBoard(BoardDB board) {
		conn = DAO.getConnect();
		String sql = "insert into boards values((select nvl(max(board_no)+1,0) from boards),?,?,?,sysdate,null)";
		int rCnt = 0;
		try {
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(++rCnt, board.getTitle());
			pstmt.setString(++rCnt, board.getContent());
			pstmt.setString(++rCnt, board.getWriter());

			int r = pstmt.executeUpdate();
			System.out.println(r + "건이 입력되었습니다.");

			if (rs.next()) {
				name = rs.getString("name");
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
	}

	// 전체 글 조회
	public List<BoardDB> getBoardList() {
		List<BoardDB> list = new ArrayList<>();
		conn = DAO.getConnect();
		String sql = "select board_no,title, content, writer, creation_date, orig_no, " 
		+ "(select count(*) from boards where orig_no=b.board_no) as reply_cnt from boards b where orig_no is null";
		
		String sql1 = "select board_no,title, content, writer, creation_date, orig_no, "
				+ "get_reply_cnt(b.board_no) as reply_cnt from boards b";
				
		BoardDB boar = null;

		try {
			pstmt = conn.prepareStatement(sql1);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				boar = new BoardDB();
				boar.setBoardNo(rs.getInt("board_no"));
				boar.setTitle(rs.getString("title") +" ("+ rs.getString("reply_cnt")+")");
				boar.setContent(rs.getString("content"));
				boar.setWriter(rs.getString("writer"));
				boar.setCreationDate(rs.getString("creation_date"));
				boar.setOrigNo(rs.getInt("orig_no"));
				list.add(boar);

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

	// 댓글달기
	public void insertReply(BoardDB board) {
		conn = DAO.getConnect();

		String sql = "insert into boards values((select nvl(max(board_no)+1,0) from boards),?,?,?,sysdate,?)";
		int rCnt = 0; // 타이틀 코텐츠 작성자(id)
		try {
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(++rCnt, board.getTitle());
			pstmt.setString(++rCnt, board.getContent());
			pstmt.setString(++rCnt, board.getWriter());
			pstmt.setInt(++rCnt, board.getOrigNo());

			pstmt.executeUpdate();

			System.out.println(board.getOrigNo() + "에 댓글이 달렸습니다.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	// 게시물 삭제
	public void deleteBoard1(BoardDB board) {
		conn = DAO.getConnect();
		List<BoardDB> boardAry = getReplyList(board.getBoardNo());
		if (boardAry.size() > 0) {
			System.out.println("댓글이있습니다.");
		} else {
			String sql = "delete from boards where board_no=? ";
			int rCnt = 0; // 타이틀 코텐츠 작성자(id)
			try {
				pstmt = conn.prepareStatement(sql);

				pstmt.setInt(++rCnt, board.getBoardNo());

				pstmt.executeUpdate();

			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public void deleteBoard2(BoardDB board) {
		conn = DAO.getConnect();
		String sql = "delete from boards where board_no=? ";
		int rCnt = 0; // 타이틀 코텐츠 작성자(id)
		try {
			pstmt = conn.prepareStatement(sql);

			pstmt.setInt(++rCnt, board.getBoardNo());

			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
}
