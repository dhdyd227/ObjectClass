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

	public void writeBoard() {
		int boardNo = 0;
		System.out.println("직원등록");
		System.out.println("직원번호 입력: ");
		int empId = sc.nextInt();
		sc.nextLine();

		System.out.println("이름을 입력하세요.");
		String firstName = sc.nextLine();

		System.out.println("성을 입력하세요.");
		String lastName = sc.nextLine();

		System.out.println("email을 입력하세요");
		String email = sc.nextLine();

		System.out.println("입사일을 입력하세요");
		String hireDate = sc.nextLine();

		System.out.println("급여를 입력하세요");
		int salary = sc.nextInt();
		sc.nextLine();

		System.out.println("JobId를 입력하세요");
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
		System.out.println("한건조회.");
		System.out.println("조회할 사원번호를 입력.");
		int empNo = 0;
		boolean check = true;
		while (check)
			try {
				System.out.println("조회할 번호를 입력:");
				empNo = sc.nextInt(); // (문자입력) error 발생가능
				sc.nextLine();
				check = false;
			} catch (Exception e) {
				sc.nextLine();
				System.out.println("숫자를 입력해주세요.");
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
		System.out.println("전체직원 글조회.");
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
		System.out.println("아이디삭제.");
		int empNo = 0;
		boolean check = true;

		while (check)
			try {
				System.out.println("삭제할 번호를 입력:");
				empNo = sc.nextInt(); // (문자입력) error 발생가능
				sc.nextLine();
				check = false;
			} catch (Exception e) {
				sc.nextLine();
				System.out.println("숫자를 입력해주세요.");
			}

		 service.deleteEmployee(empNo);

		System.out.println("employee_id: "+empNo + "삭제완료");
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
		// service.updateBoard(board, boardAry);
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
		// service.updateTitleBoard(board, boardAry);
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
		// service.updateWriterBoard(board, boardAry);
	}

}
