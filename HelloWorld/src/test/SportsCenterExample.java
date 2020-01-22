package test;

import java.util.List;
import java.util.Scanner;

import com.board.model.Board;

public class SportsCenterExample {
	static Scanner sc = new Scanner(System.in);
	static SportsCenter[] sportsAry = new SportsCenter[10];
	static SportsService service = new SportsServiceImpl();
	

	public static void main(String[] args) {
		while (true) {
			System.out.println("메뉴선택하세요.");
			System.out.println("1.회원등록 2.회원번호조회 3.등록그룹별 리스트 4.종료");
			int menu = 0;

			try {
				menu = sc.nextInt(); // (문자입력) error 발생가능
				sc.nextLine();
			} catch (Exception e) {
				sc.nextLine();
				System.out.println("정상적인 메뉴를 선택해주세요.");
			}

			if (menu == 1) {
				enroll();
			} else if (menu == 2) {
				memberserarch();
			} else if (menu == 3) {
				enrollgroup();
			} else if (menu == 4) {
				break;
			}System.out.println("프로그램종료");

		}
	}
		

	public static void enroll() {
		int membership = 0;
		System.out.println("회원등록.");

		boolean check = true;
		while (check)
			try {
				System.out.println("회원번호입력: ");
				membership = sc.nextInt(); // (문자입력) error 발생가능
				sc.nextLine();
				check = false;
			} catch (Exception e) {
				sc.nextLine();
				System.out.println("숫자를 입력해주세요.");
			}

		System.out.println("이름을 입력하세요.: ");
		String name = sc.nextLine();
	
		String enroll2=null;

	
	
	
			System.out.println("'(1)수영','(2)테니스','(3)베드민턴' 중 등록과정 번호로입력하세요: ");
			
			String enrollmentprocess= sc.nextLine();
			
			if (enrollmentprocess.equals("1") || enrollmentprocess.equals("2") || 
					enrollmentprocess.equals("3")) {
				switch(Integer.parseInt(enrollmentprocess)) {
				case 1:
					SportsCenter sport = new SportsCenter(membership, name, "수영");
					service.enroll(sport, sportsAry);
					break;
				case 2:
					SportsCenter sport1 = new SportsCenter(membership, name, "테니스");
					service.enroll(sport1, sportsAry);
					break;
				case 3:
					SportsCenter sport2 = new SportsCenter(membership, name, "베드민턴");
					service.enroll(sport2, sportsAry);
					break;
				}

			}else {
				System.out.println("재입력부탁드립니다.");
			}
		
//			SportsCenter sport = new SportsCenter(membership, name, enrollmentprocess);
//			service.enroll(sport, sportsAry);

	}

	public static SportsCenter memberserarch() {
		System.out.println("회원조회.");
		int memNum = 0;
		boolean check = true;
		while (check)
			try {
				System.out.println("조회할 번호를 입력:");
				memNum = sc.nextInt(); // (문자입력) error 발생가능
				sc.nextLine();
				check = false;
			} catch (Exception e) {
				sc.nextLine();
				System.out.println("숫자를 입력해주세요.");
			}
		//sportsAry SportsService
		SportsCenter sport = service.memberserarch(memNum, sportsAry);
		System.out.println(sport);
		return null;
	}

	public static void enrollgroup() {
		System.out.println("등록그룹별 리스트.");
		SportsCenter[] resultAry = service.enrollgroup(sportsAry);
		for (SportsCenter spt : sportsAry) {
			if (spt != null)
				System.out.println(spt);
	}
	}
}
