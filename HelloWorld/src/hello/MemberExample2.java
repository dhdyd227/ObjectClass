package hello;

import java.util.Scanner;

public class MemberExample2 {
	private static Member[] MemberArray = new Member[100];
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("------------------------");
			System.out.println("1.���� 2.��ü����Ʈ 3.id, password �Է� 4.����");
			System.out.println("------------------------");
			int menu = sc.nextInt();
			sc.nextLine();
			if (menu == 1) { // ����
				createMember();
			} else if (menu == 2) {// ��ü ����Ʈ
				getMemberList();
			} else if (menu == 3) {// id password �̸�,���̸����
				idSearch();
			} else if (menu == 4)
				run = false;
		}
	}

	// ���� �ν��Ͻ��� ����� �޼ҵ�.
	public static void createMember() {
		System.out.println("createMember()");
		System.out.println("����ڸ� �Է�: ");
		String MemberName = sc.nextLine();

		System.out.println("id �Է�: ");
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

	// ���� ����Ʈ�� ��ȸ�ϴ� �޼ҵ�.
	public static void getMemberList() {
		System.out.println("getMemberList() ");
		for (Member a : MemberArray) {
			if (a != null)
				System.out.println("�̸�: " + a.getName() + ", id: " + a.getId() + ", password: " + a.getPassword()
						+ ", ����: " + a.getAge());
		}
	}

	// ���̵���ȸ
	public static void idSearch() {
		System.out.println("idSearch() ");
		System.out.println("id �Է�: ");
		String id = sc.nextLine();

		System.out.println("password �Է�: ");
		String password = sc.nextLine();

		for (Member acct : MemberArray) {
			if (acct != null && acct.getId().equals(id)) {//AND������ �տ��� false �ڿ��� ����!
				if (acct.getPassword().equals(password)) {
					System.out.println("�̸�: " + acct.getName() + "����: " + acct.getAge());
					return;
					
				} else {
					System.out.println("password �߸�");
					return;
				}
			}
			else {
				System.out.println("���������ʴ� id�Դϴ�.");
				return;
			}
		}

	}

	public static Member findMember(String ano) {
		System.out.println("findMember(String ano)");

		return null;
	}

}
