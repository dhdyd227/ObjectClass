package com.board.control;

import java.util.List;
import java.util.Scanner;

import com.board.impl.EmployeeServiceImpl;
import com.board.model.Board;
import com.board.model.Employee;
import com.board.model.EmployeeService;

public class EmpProc {
	Scanner sc = new Scanner(System.in);
	EmployeeService service = new EmployeeServiceImpl();

	public void execute() {
		while (true) {
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

	public void writeBoard() {
		int boardNo = 0;
		System.out.println("�������");
		System.out.println("������ȣ �Է�: ");
		int empId = sc.nextInt();
		sc.nextLine();

		System.out.println("�̸��� �Է��ϼ���.");
		String firstName = sc.nextLine();

		System.out.println("���� �Է��ϼ���.");
		String lastName = sc.nextLine();

		System.out.println("email�� �Է��ϼ���");
		String email = sc.nextLine();

		System.out.println("�Ի����� �Է��ϼ���");
		String hireDate = sc.nextLine();

		System.out.println("�޿��� �Է��ϼ���");
		int salary = sc.nextInt();
		sc.nextLine();

		System.out.println("JobId�� �Է��ϼ���");
		String jobId = sc.nextLine();

		Employee emp = new Employee();
		emp.setEmployeeId(empId);
		emp.setFirstName(firstName);
		emp.setLastName(lastName);
		emp.setEmail(email);
		emp.setHireDate(hireDate); //2010-05-05
		emp.setSalary(salary);
		emp.setJobId(jobId);
		service.insertEmployee(emp);

	}

	public void getBoard() {
		System.out.println("�Ѱ���ȸ.");
		System.out.println("��ȸ�� �����ȣ�� �Է�.");
		int empNo = 0;
		boolean check = true;
		while (check)
			try {
				System.out.println("��ȸ�� ��ȣ�� �Է�:");
				empNo = sc.nextInt(); // (�����Է�) error �߻�����
				sc.nextLine();
				check = false;
			} catch (Exception e) {
				sc.nextLine();
				System.out.println("���ڸ� �Է����ּ���.");
			}

		 Employee emp = service.getEmployee(empNo);
		 System.out.println(emp);

//		for (int i = 0; i < boardAry.length; i++) {
//			if (boardAry[i] != null && boardAry[i].getBoardNo() == boardNo) {
//				System.out.println(boardAry[i].getBoardNo() + "," + boardAry[i].getTitle() + ","
//						+ boardAry[i].getContents() + "," + boardAry[i].getWriter());
//			}
//		}
	}

	public void getBoardList() {
		System.out.println("��ü���� ����ȸ.");
		List<Employee> resultAry = service.getEmpList();
		for (Employee brd : resultAry) {
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
		System.out.println("���̵����.");
		int empNo = 0;
		boolean check = true;

		while (check)
			try {
				System.out.println("������ ��ȣ�� �Է�:");
				empNo = sc.nextInt(); // (�����Է�) error �߻�����
				sc.nextLine();
				check = false;
			} catch (Exception e) {
				sc.nextLine();
				System.out.println("���ڸ� �Է����ּ���.");
			}

		 service.deleteEmployee(empNo);

		System.out.println("employee_id: "+empNo + "�����Ϸ�");
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
		// service.updateBoard(board, boardAry);
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
		// service.updateTitleBoard(board, boardAry);
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
		// service.updateWriterBoard(board, boardAry);
	}

}
