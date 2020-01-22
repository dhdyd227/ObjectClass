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
			System.out.println("1.�Խñ� �ۼ� 2.��ü �Խñ� ����Ʈ 3.�Խñ���ȸ 4.�Խñ� ���� 5.�� ����~~ 9.����");
			menu = sc.nextInt();
			sc.nextLine();

			if (menu == 1) {
				System.out.println("1������");
				writeBoard();
			} else if (menu == 2) {
				System.out.println("2������");
				getBoardList();
			} else if (menu == 3) {
				System.out.println("3������");
				getBoard();
			} else if (menu == 4) {
				System.out.println("4������");
				updateBoard();
			} else if (menu == 5) {
				System.out.println("5������");
				deleteBoard();
			}
		}
	}

	public void loginCheck() {
		while (true) {
			System.out.println("id�Է��ϼ���.");
			String id = sc.nextLine();

			System.out.println("pass�Է��ϼ���.");
			String passwd = sc.nextLine();

			String name = service.loginCheck(id, passwd);

			if (name != null) {
				System.out.println(name + "�� ȯ���մϴ�.");
				loginId = id;
				break;
			} else {
				System.out.println("���̵�� ��й�ȣ�� �ٽ� �Է�: ");
			}
		}
	}

	// ���ۼ�
	public void writeBoard() {
		System.out.println("���ۼ�.");

		System.out.println("������ �Է��ϼ���.: ");
		String title = sc.nextLine();

		System.out.println("������ �Է��ϼ���: ");
		String contents = sc.nextLine();

		String writer = loginId;

		BoardDB boardDB = new BoardDB(0, title, contents, writer, "", 0);
		service.insertBoard(boardDB);
	}

	// ��ü�� ��ȸ
	public void getBoardList() {
		List<BoardDB> resultAry = service.getBoardList();
		for (BoardDB brd : resultAry) {
			if (brd != null)
				System.out.println(brd);
		}
	}

	public void getBoard() {
		System.out.println("��ȸ�� �۹�ȣ: ");
		int boardNo = sc.nextInt();
		sc.nextLine();
		// ---������
		System.out.println("-------------[������]-------------");
		BoardDB board = service.getBoard(boardNo);
		System.out.println(board);
		if (board.getBoardNo() != 0) {
			System.out.println("����" + board.getTitle());
			System.out.println("����" + board.getContent());
			System.out.println("�ۼ���" + board.getWriter());
			System.out.println("�ۼ�����" + board.getCreationDate());

			// ---���
			List<BoardDB> list = service.getReply(boardNo);
			System.out.println("-------------[���]-------------");

			for (BoardDB brd : list) {
				System.out.println("-> " + brd.getBoardNo() + "|" + brd.getContent() + "|" + brd.getCreationDate());
			}
			System.out.println("--------------------------");
			if (list != null)
				System.out.println("1. ��� �ۼ� 2. ���� �޴�");
			else {
				System.out.println("����� �����ϴ�.");
				return;
			}

			int subMenu = 0;
			subMenu = sc.nextInt();
			sc.nextLine();
			if (subMenu == 1) {
				System.out.println("��� �Է�");
				insertReply(board);
			} else {
				return;
			}

		} else {
			System.out.println("���¹�ȣ�Դϴ�.");
		}
	}

	private void insertReply(BoardDB board) {
		System.out.println("����ۼ�.");

		System.out.println("������ �Է��ϼ���: ");
		String contents = sc.nextLine();

		BoardDB boardDB = new BoardDB(0, board.getTitle(), contents, loginId, "", board.getBoardNo());
		service.insertReply(boardDB);
	}

	// ������Ʈ
	public void updateBoard() {
		System.out.println("������ �� ��ȣ:");
		int boardNo = sc.nextInt();
		sc.nextLine();

		System.out.println("���� ����: ");
		String title = sc.nextLine();

		System.out.println("���� ����: ");
		String content = sc.nextLine();

		BoardDB board = new BoardDB();
		board.setBoardNo(boardNo);
		board.setTitle(title);
		board.setContent(content);
		board.setWriter(loginId);
		
		service.updateBoard(board);
	}

	// ���� �� ����
	public void deleteBoard() {
		System.out.println("������ �� ��ȣ:");
		int boardNo = sc.nextInt();
		sc.nextLine();
		
		BoardDB board = new BoardDB();
		board.setBoardNo(boardNo);
		board.setWriter(loginId);
		
		service.deleteBoard(board);

		
	}
}
