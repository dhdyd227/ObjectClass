package hello;

import java.util.Scanner;

public class MemberExample2 {
	private static Member[] MemberArray = new Member[100];
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("------------------------");
			System.out.println("1.생성 2.전체리스트 3.id, password 입력 4.종료");
			System.out.println("------------------------");
			int menu = sc.nextInt();
			sc.nextLine();
			if (menu == 1) { // 가입
				createMember();
			} else if (menu == 2) {// 전체 리스트
				getMemberList();
			} else if (menu == 3) {// id password 이름,나이를출력
				idSearch();
			} else if (menu == 4)
				run = false;
		}
	}

	// 계좌 인스턴스를 만드는 메소드.
	public static void createMember() {
		System.out.println("createMember()");
		System.out.println("사용자명 입력: ");
		String MemberName = sc.nextLine();

		System.out.println("id 입력: ");
		String MemberID = sc.nextLine();

		System.out.println("password:  ");
		String MemberPassword = sc.nextLine();

		System.out.println("age:  ");
		int MemberAge = sc.nextInt();

		Member accnt = new Member(MemberName, MemberID, MemberPassword, MemberAge);
		for (int i = 0; i < MemberArray.length; i++) {
			if (MemberArray[i] == null) {
				MemberArray[i] = accnt;
				break;
			}

		}

	}

	// 계좌 리스트를 조회하는 메소드.
	public static void getMemberList() {
		System.out.println("getMemberList() ");
		for (Member a : MemberArray) {
			if (a != null)
				System.out.println("이름: " + a.getName() + ", id: " + a.getId() + ", password: " + a.getPassword()
						+ ", 나이: " + a.getAge());
		}
	}

	// 아이디조회
	public static void idSearch() {
		System.out.println("idSearch() ");
		System.out.println("id 입력: ");
		String id = sc.nextLine();

		System.out.println("password 입력: ");
		String password = sc.nextLine();

		for (Member acct : MemberArray) {
			if (acct != null && acct.getId().equals(id)) {//AND연산은 앞에께 false 뒤에꺼 안함!
				if (acct.getPassword().equals(password)) {
					System.out.println("이름: " + acct.getName() + "나이: " + acct.getAge());
					return;
					
				} else {
					System.out.println("password 잘못");
					return;
				}
			}
			else {
				System.out.println("존재하지않는 id입니다.");
				return;
			}
		}

	}

	public static Member findMember(String ano) {
		System.out.println("findMember(String ano)");

		return null;
	}

}
