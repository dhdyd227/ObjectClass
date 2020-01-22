package com.board.control;

import java.util.List;
import java.util.Scanner;

import com.board.common.DAO;
import com.board.impl.BoardDBServiceImpl;
import com.board.model.BoardDB;
import com.board.model.BoardDBService;
import com.board.model.Employee;

public class BoardDBproc {
	Scanner sc = new Scanner(System.in);

	BoardDBService service = new BoardDBServiceImpl();
	String loginId = null;
	
	
	
	public void execute() {
		loginCheck();
		while (true) {
			int menu = 0;
			System.out.println("1.게시글 작성 2.전체 게시글 리스트 3.게시글조회 4.게시글 수정 5.글 삭제~~ 9.종료");
			menu = sc.nextInt();
			sc.nextLine();

			if (menu == 1) {
				System.out.println("1번선택");
				writeBoard();
			} else if (menu == 2) {
				System.out.println("2번선택");
				getBoardList();
			} else if (menu == 3) {
				System.out.println("3번선택");
				getBoard();
			} else if (menu == 4) {
				System.out.println("4번선택");
				updateBoard();
			} else if (menu == 5) {
				System.out.println("5번선택");
				deleteBoard();
			}
		}
	}

	public void loginCheck() {
		while (true) {
			System.out.println("id입력하세요.");
			String id = sc.nextLine();

			System.out.println("pass입력하세요.");
			String passwd = sc.nextLine();

			String name = service.loginCheck(id, passwd);

			if (name != null) {
				System.out.println(name + "님 환영합니다.");
				loginId = id;
				break;
			} else {
				System.out.println("아이디와 비밀번호를 다시 입력: ");
			}
		}
	}

	// 글작성
	public void writeBoard() {
		System.out.println("글작성.");

		System.out.println("제목을 입력하세요.: ");
		String title = sc.nextLine();

		System.out.println("내용을 입력하세요: ");
		String contents = sc.nextLine();

		String writer = loginId;

		BoardDB boardDB = new BoardDB(0, title, contents, writer, "", 0);
		service.insertBoard(boardDB);
	}

	// 전체글 조회
	public void getBoardList() {
		List<BoardDB> resultAry = service.getBoardList();
		for (BoardDB brd : resultAry) {
			if (brd != null)
				System.out.println(brd);
		}
	}

	public void getBoard() {
		System.out.println("조회할 글번호: ");
		int boardNo = sc.nextInt();
		sc.nextLine();
		// ---원본글
		System.out.println("-------------[원본글]-------------");
		BoardDB board = service.getBoard(boardNo);
		System.out.println(board);
		if (board.getBoardNo() != 0) {
			System.out.println("제목" + board.getTitle());
			System.out.println("내용" + board.getContent());
			System.out.println("작성자" + board.getWriter());
			System.out.println("작설일지" + board.getCreationDate());

			// ---댓글
			List<BoardDB> list = service.getReply(boardNo);
			System.out.println("-------------[댓글]-------------");

			for (BoardDB brd : list) {
				System.out.println("-> " + brd.getBoardNo() + "|" + brd.getContent() + "|" + brd.getCreationDate());
			}
			System.out.println("--------------------------");
			if (list != null)
				System.out.println("1. 댓글 작성 2. 이전 메뉴");
			else {
				System.out.println("댓글이 없습니다.");
				return;
			}

			int subMenu = 0;
			subMenu = sc.nextInt();
			sc.nextLine();
			if (subMenu == 1) {
				System.out.println("댓글 입력");
				insertReply(board);
			} else {
				return;
			}

		} else {
			System.out.println("없는번호입니다.");
		}
	}

	private void insertReply(BoardDB board) {
		System.out.println("댓글작성.");

		System.out.println("내용을 입력하세요: ");
		String contents = sc.nextLine();

		BoardDB boardDB = new BoardDB(0, board.getTitle(), contents, loginId, "", board.getBoardNo());
		service.insertReply(boardDB);
	}

	// 업데이트
	public void updateBoard() {
		System.out.println("변경할 글 번호:");
		int boardNo = sc.nextInt();
		sc.nextLine();

		System.out.println("제목 변경: ");
		String title = sc.nextLine();

		System.out.println("내용 변경: ");
		String content = sc.nextLine();

		BoardDB board = new BoardDB();
		board.setBoardNo(boardNo);
		board.setTitle(title);
		board.setContent(content);
		board.setWriter(loginId);
		
		service.updateBoard(board);
	}

	// 보드 글 삭제
	public void deleteBoard() {
		System.out.println("삭제할 글 번호:");
		int boardNo = sc.nextInt();
		sc.nextLine();
		
		BoardDB board = new BoardDB();
		board.setBoardNo(boardNo);
		board.setWriter(loginId);
		
		service.deleteBoard(board);

		
	}
}
