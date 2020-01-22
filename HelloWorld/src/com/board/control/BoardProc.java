package com.board.control;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

import com.board.impl.BoardCollectionImpl;
import com.board.impl.BoardServiceImpl;
import com.board.model.Board;
import com.board.model.BoardCollection;
import com.board.model.BoardService;

public class BoardProc {
	Scanner sc = new Scanner(System.in);
//	List<Board> boardAry = new Board[10];
	List<Board> boardAry = new ArrayList<>();
	
//	BoardService service = new BoardServiceImpl();
	BoardCollection service = new BoardCollectionImpl();
	public void execute() {
		while (true) {
			login_check();
			System.out.println("메뉴선택하세요.");
			System.out.println("1.작성 2.단건조회 3.전체조회 4.내용 변경 5.제목 변경 6.작성자 변경 8.삭제 9.종료");
			int menu = 0;

			try {
				menu = sc.nextInt(); // (문자입력) error 발생가능
				sc.nextLine();
			} catch (Exception e) {
				sc.nextLine();
				System.out.println("정상적인 메뉴를 선택해주세요.");
			}

			if (menu == 1) {
				writeBoard();
			} else if (menu == 2) {
				getBoard();
			} else if (menu == 3) {
				getBoardList();
			} else if (menu == 4) {
				updateBoard();
			} else if (menu == 5) {
				updateTitleBoard();
			} else if (menu == 6) {
				updateWriterBoard();
			} else if (menu == 8) {
				deleteBoard();
			} else if (menu == 9) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

		}

		System.out.println("프로그램종료");

	}
	public void login_check(){
		while(true) {
			System.out.println("id입력");
			String id = sc.nextLine();
			System.out.println("passwd 입력.");
			String passwd = sc.nextLine();
			
			if(id.equals("user1") && passwd.equals("1234")) {
				System.out.println("방문자 1님 환영합니다.");
				break;
			}
			else {
				System.out.println("id,passwd 입력");
			}
		}
	}

	public void writeBoard() {
		int boardNo = 0;
		System.out.println("글작성.");

		boolean check = true;
		while (check)
			try {
				System.out.println("게시글 번호입력: ");
				boardNo = sc.nextInt(); // (문자입력) error 발생가능
				sc.nextLine();
				check = false;
			} catch (Exception e) {
				sc.nextLine();
				System.out.println("숫자를 입력해주세요.");
			}

		System.out.println("제목을 입력하세요.: ");
		String title = sc.nextLine();

		System.out.println("내용을 입력하세요: ");
		String contents = sc.nextLine();

		System.out.println("작성자 입력하세요: ");
		String writer = sc.nextLine();

		Board board = new Board(boardNo, title, contents, writer);
		service.writeBoard(board, boardAry);

//		for (int i = 0; i < boardAry.length; i++) {
//			if (boardAry[i] == null) {
//				boardAry[i] = board;
//				break;
//			}
//		}

	}

	public void getBoard() {
		System.out.println("단건조회.");
		int boardNo = 0;
		boolean check = true;
		while (check)
			try {
				System.out.println("조회할 번호를 입력:");
				boardNo = sc.nextInt(); // (문자입력) error 발생가능
				sc.nextLine();
				check = false;
			} catch (Exception e) {
				sc.nextLine();
				System.out.println("숫자를 입력해주세요.");
			}

		Board board = service.getBoard(boardNo, boardAry);
		System.out.println(board);

//		for (int i = 0; i < boardAry.length; i++) {
//			if (boardAry[i] != null && boardAry[i].getBoardNo() == boardNo) {
//				System.out.println(boardAry[i].getBoardNo() + "," + boardAry[i].getTitle() + ","
//						+ boardAry[i].getContents() + "," + boardAry[i].getWriter());
//			}
//		}
	}

	public void getBoardList() {
		System.out.println("전체글조회.");
		List<Board> resultAry = service.getBoardList(boardAry);
		for (Board brd : resultAry) {
			if (brd != null)
				System.out.println(brd);
		}

//		for (int i = 0; i < boardAry.length; i++) {
//			if (boardAry[i] != null) {
//				System.out.println(boardAry[i].getBoardNo() + "," + boardAry[i].getTitle() + ","
//						+ boardAry[i].getContents() + "," + boardAry[i].getWriter());
//			}
//		}
	}

	public void deleteBoard() {
		System.out.println("게시물삭제.");
		int boardNo = 0;
		boolean check = true;

		while (check)
			try {
				System.out.println("삭제할 번호를 입력:");
				boardNo = sc.nextInt(); // (문자입력) error 발생가능
				sc.nextLine();
				check = false;
			} catch (Exception e) {
				sc.nextLine();
				System.out.println("숫자를 입력해주세요.");
			}

		service.deleteBoard(boardNo, boardAry);

		System.out.println(boardNo + "삭제완료");
	}

	public void updateBoard() {
		int boardNo = 0;
		boolean check = true;

		while (check)
			try {
				System.out.println("변경할 글번호");
				boardNo = sc.nextInt(); // (문자입력) error 발생가능
				sc.nextLine();
				check = false;
			} catch (Exception e) {
				sc.nextLine();
				System.out.println("숫자를 입력해주세요.");
			}

		System.out.println("변경할 내용 : ");
		String content = sc.nextLine();

		Board board = new Board(boardNo, "", content, "");
		service.updateBoard(board, boardAry);
	}

	public void updateTitleBoard() {

		int boardNo = 0;
		boolean check = true;

		while (check)
			try {
				System.out.println("변경할 글번호");
				boardNo = sc.nextInt(); // (문자입력) error 발생가능
				sc.nextLine();
				check = false;
			} catch (Exception e) {
				sc.nextLine();
				System.out.println("숫자를 입력해주세요.");
			}

		System.out.println("변경할 제목 : ");

		String title = sc.nextLine();
		Board board = new Board(boardNo, title, "", "");
		service.updateTitleBoard(board, boardAry);
	}

	public void updateWriterBoard() {

		int boardNo = 0;
		boolean check = true;

		while (check)
			try {
				System.out.println("변경할 글번호");
				boardNo = sc.nextInt(); // (문자입력) error 발생가능
				sc.nextLine();
				check = false;
			} catch (Exception e) {
				sc.nextLine();
				System.out.println("숫자를 입력해주세요.");
			}

		System.out.println("변경할 내용 : ");
		String writer = sc.nextLine();
		Board board = new Board(boardNo, "", "", writer);
		service.updateWriterBoard(board, boardAry);
	}

}
