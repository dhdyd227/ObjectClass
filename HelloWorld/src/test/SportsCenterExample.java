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
			System.out.println("�޴������ϼ���.");
			System.out.println("1.ȸ����� 2.ȸ����ȣ��ȸ 3.��ϱ׷캰 ����Ʈ 4.����");
			int menu = 0;

			try {
				menu = sc.nextInt(); // (�����Է�) error �߻�����
				sc.nextLine();
			} catch (Exception e) {
				sc.nextLine();
				System.out.println("�������� �޴��� �������ּ���.");
			}

			if (menu == 1) {
				enroll();
			} else if (menu == 2) {
				memberserarch();
			} else if (menu == 3) {
				enrollgroup();
			} else if (menu == 4) {
				break;
			}System.out.println("���α׷�����");

		}
	}
		

	public static void enroll() {
		int membership = 0;
		System.out.println("ȸ�����.");

		boolean check = true;
		while (check)
			try {
				System.out.println("ȸ����ȣ�Է�: ");
				membership = sc.nextInt(); // (�����Է�) error �߻�����
				sc.nextLine();
				check = false;
			} catch (Exception e) {
				sc.nextLine();
				System.out.println("���ڸ� �Է����ּ���.");
			}

		System.out.println("�̸��� �Է��ϼ���.: ");
		String name = sc.nextLine();
	
		String enroll2=null;

	
	
	
			System.out.println("'(1)����','(2)�״Ͻ�','(3)�������' �� ��ϰ��� ��ȣ���Է��ϼ���: ");
			
			String enrollmentprocess= sc.nextLine();
			
			if (enrollmentprocess.equals("1") || enrollmentprocess.equals("2") || 
					enrollmentprocess.equals("3")) {
				switch(Integer.parseInt(enrollmentprocess)) {
				case 1:
					SportsCenter sport = new SportsCenter(membership, name, "����");
					service.enroll(sport, sportsAry);
					break;
				case 2:
					SportsCenter sport1 = new SportsCenter(membership, name, "�״Ͻ�");
					service.enroll(sport1, sportsAry);
					break;
				case 3:
					SportsCenter sport2 = new SportsCenter(membership, name, "�������");
					service.enroll(sport2, sportsAry);
					break;
				}

			}else {
				System.out.println("���Էº�Ź�帳�ϴ�.");
			}
		
//			SportsCenter sport = new SportsCenter(membership, name, enrollmentprocess);
//			service.enroll(sport, sportsAry);

	}

	public static SportsCenter memberserarch() {
		System.out.println("ȸ����ȸ.");
		int memNum = 0;
		boolean check = true;
		while (check)
			try {
				System.out.println("��ȸ�� ��ȣ�� �Է�:");
				memNum = sc.nextInt(); // (�����Է�) error �߻�����
				sc.nextLine();
				check = false;
			} catch (Exception e) {
				sc.nextLine();
				System.out.println("���ڸ� �Է����ּ���.");
			}
		//sportsAry SportsService
		SportsCenter sport = service.memberserarch(memNum, sportsAry);
		System.out.println(sport);
		return null;
	}

	public static void enrollgroup() {
		System.out.println("��ϱ׷캰 ����Ʈ.");
		SportsCenter[] resultAry = service.enrollgroup(sportsAry);
		for (SportsCenter spt : sportsAry) {
			if (spt != null)
				System.out.println(spt);
	}
	}
}
