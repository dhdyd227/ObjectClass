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
			System.out.println("�޴������ϼ���.");
			System.out.println("1.�ۼ� 2.�ܰ���ȸ 3.��ü��ȸ 4.���� ���� 5.���� ���� 6.�ۼ��� ���� 8.���� 9.����");
			int menu = 0;

			try {
				menu = sc.nextInt(); // (�����Է�) error �߻�����
				sc.nextLine();
			} catch (Exception e) {
				sc.nextLine();
				System.out.println("�������� �޴��� �������ּ���.");
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
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}

		}

		System.out.println("���α׷�����");

	}
	public void login_check(){
		while(true) {
			System.out.println("id�Է�");
			String id = sc.nextLine();
			System.out.println("passwd �Է�.");
			String passwd = sc.nextLine();
			
			if(id.equals("user1") && passwd.equals("1234")) {
				System.out.println("�湮�� 1�� ȯ���մϴ�.");
				break;
			}
			else {
				System.out.println("id,passwd �Է�");
			}
		}
	}

	public void writeBoard() {
		int boardNo = 0;
		System.out.println("���ۼ�.");

		boolean check = true;
		while (check)
			try {
				System.out.println("�Խñ� ��ȣ�Է�: ");
				boardNo = sc.nextInt(); // (�����Է�) error �߻�����
				sc.nextLine();
				check = false;
			} catch (Exception e) {
				sc.nextLine();
				System.out.println("���ڸ� �Է����ּ���.");
			}

		System.out.println("������ �Է��ϼ���.: ");
		String title = sc.nextLine();

		System.out.println("������ �Է��ϼ���: ");
		String contents = sc.nextLine();

		System.out.println("�ۼ��� �Է��ϼ���: ");
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
		System.out.println("�ܰ���ȸ.");
		int boardNo = 0;
		boolean check = true;
		while (check)
			try {
				System.out.println("��ȸ�� ��ȣ�� �Է�:");
				boardNo = sc.nextInt(); // (�����Է�) error �߻�����
				sc.nextLine();
				check = false;
			} catch (Exception e) {
				sc.nextLine();
				System.out.println("���ڸ� �Է����ּ���.");
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
		System.out.println("��ü����ȸ.");
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
		System.out.println("�Խù�����.");
		int boardNo = 0;
		boolean check = true;

		while (check)
			try {
				System.out.println("������ ��ȣ�� �Է�:");
				boardNo = sc.nextInt(); // (�����Է�) error �߻�����
				sc.nextLine();
				check = false;
			} catch (Exception e) {
				sc.nextLine();
				System.out.println("���ڸ� �Է����ּ���.");
			}

		service.deleteBoard(boardNo, boardAry);

		System.out.println(boardNo + "�����Ϸ�");
	}

	public void updateBoard() {
		int boardNo = 0;
		boolean check = true;

		while (check)
			try {
				System.out.println("������ �۹�ȣ");
				boardNo = sc.nextInt(); // (�����Է�) error �߻�����
				sc.nextLine();
				check = false;
			} catch (Exception e) {
				sc.nextLine();
				System.out.println("���ڸ� �Է����ּ���.");
			}

		System.out.println("������ ���� : ");
		String content = sc.nextLine();

		Board board = new Board(boardNo, "", content, "");
		service.updateBoard(board, boardAry);
	}

	public void updateTitleBoard() {

		int boardNo = 0;
		boolean check = true;

		while (check)
			try {
				System.out.println("������ �۹�ȣ");
				boardNo = sc.nextInt(); // (�����Է�) error �߻�����
				sc.nextLine();
				check = false;
			} catch (Exception e) {
				sc.nextLine();
				System.out.println("���ڸ� �Է����ּ���.");
			}

		System.out.println("������ ���� : ");

		String title = sc.nextLine();
		Board board = new Board(boardNo, title, "", "");
		service.updateTitleBoard(board, boardAry);
	}

	public void updateWriterBoard() {

		int boardNo = 0;
		boolean check = true;

		while (check)
			try {
				System.out.println("������ �۹�ȣ");
				boardNo = sc.nextInt(); // (�����Է�) error �߻�����
				sc.nextLine();
				check = false;
			} catch (Exception e) {
				sc.nextLine();
				System.out.println("���ڸ� �Է����ּ���.");
			}

		System.out.println("������ ���� : ");
		String writer = sc.nextLine();
		Board board = new Board(boardNo, "", "", writer);
		service.updateWriterBoard(board, boardAry);
	}

}
