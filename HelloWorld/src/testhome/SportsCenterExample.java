package testhome;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SportsCenterExample {
	static Scanner sc = new Scanner(System.in);
	static SportsCenter[] sportsAry = new SportsCenter[10];
	static SportsService service = new SportsServiceImpl();
	
	int key=0;
	static Map<Integer,SportsCenter> sportsMap = new HashMap<>();
	
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
			}
		}
		System.out.println("프로그램종료");

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

				if(sportsMap.get(membership) != null) {
					System.out.println("존재하는 회원번호입니다 재입력 해주세요");
					continue;
				}
				check = false;
			} catch (Exception e) {
				sc.nextLine();
				System.out.println("숫자를 입력해주세요.");
			}

		System.out.println("이름을 입력하세요.: ");
		String name = sc.nextLine();


		String enrollmentprocess;
		
		while(true) {
			System.out.println("'(1).수영','(2).테니스','(3).베드민턴' 중  등록과정을  숫자로입력하세요: ");
			enrollmentprocess=sc.nextLine();
			if(enrollmentprocess.equals("1")) {
//				SportsCenter sport = new SportsCenter(membership, name, "수영");
//				service.enroll(sport, sportsAry);
				
				SportsCenter sport = new SportsCenter(membership, name, "수영");
				service.enroll2(sport, sportsMap);
				break;
			}else if(enrollmentprocess.equals("2")) {
//				SportsCenter sport = new SportsCenter(membership, name, "테니스");
//				service.enroll(sport, sportsAry);
				
				SportsCenter sport = new SportsCenter(membership, name, "테니스");
				service.enroll2(sport, sportsMap);
				break;
			}else if(enrollmentprocess.equals("3")) {
//				SportsCenter sport = new SportsCenter(membership, name, "배드민턴");
//				service.enroll(sport, sportsAry);
				
				SportsCenter sport = new SportsCenter(membership, name, "배드민턴");
				service.enroll2(sport, sportsMap);
				break;
			}

		}
		
		
		//한글은 한번 입력후 재입력시 오류빌셍
//			if (enrollmentprocess.equals("테니스") || enrollmentprocess.equals("베드민턴") || 
//					enrollmentprocess.equals("수영")) {
//				SportsCenter sport = new SportsCenter(membership, name, enroll2);
//				service.enroll(sport, sportsAry);
//			}else {
//				System.out.println("재입력부탁드립니다.");
//			}

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
	
//		SportsCenter sport = service.memberserarch(memNum, sportsAry);
//		System.out.println(sport);
		
		SportsCenter sport = service.memberserarch2(memNum, sportsMap);
		System.out.println(sport);
		return null;
	}

	
	public static void enrollgroup() {
		System.out.println("등록그룹별 리스트.");
		//SportsCenter[] resultAry = service.enrollgroup(sportsAry);
		service.enrollgroup2(sportsMap);
		
		
	}
}
