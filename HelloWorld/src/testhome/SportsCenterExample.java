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
			}
		}
		System.out.println("���α׷�����");

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

				if(sportsMap.get(membership) != null) {
					System.out.println("�����ϴ� ȸ����ȣ�Դϴ� ���Է� ���ּ���");
					continue;
				}
				check = false;
			} catch (Exception e) {
				sc.nextLine();
				System.out.println("���ڸ� �Է����ּ���.");
			}

		System.out.println("�̸��� �Է��ϼ���.: ");
		String name = sc.nextLine();


		String enrollmentprocess;
		
		while(true) {
			System.out.println("'(1).����','(2).�״Ͻ�','(3).�������' ��  ��ϰ�����  ���ڷ��Է��ϼ���: ");
			enrollmentprocess=sc.nextLine();
			if(enrollmentprocess.equals("1")) {
//				SportsCenter sport = new SportsCenter(membership, name, "����");
//				service.enroll(sport, sportsAry);
				
				SportsCenter sport = new SportsCenter(membership, name, "����");
				service.enroll2(sport, sportsMap);
				break;
			}else if(enrollmentprocess.equals("2")) {
//				SportsCenter sport = new SportsCenter(membership, name, "�״Ͻ�");
//				service.enroll(sport, sportsAry);
				
				SportsCenter sport = new SportsCenter(membership, name, "�״Ͻ�");
				service.enroll2(sport, sportsMap);
				break;
			}else if(enrollmentprocess.equals("3")) {
//				SportsCenter sport = new SportsCenter(membership, name, "������");
//				service.enroll(sport, sportsAry);
				
				SportsCenter sport = new SportsCenter(membership, name, "������");
				service.enroll2(sport, sportsMap);
				break;
			}

		}
		
		
		//�ѱ��� �ѹ� �Է��� ���Է½� ��������
//			if (enrollmentprocess.equals("�״Ͻ�") || enrollmentprocess.equals("�������") || 
//					enrollmentprocess.equals("����")) {
//				SportsCenter sport = new SportsCenter(membership, name, enroll2);
//				service.enroll(sport, sportsAry);
//			}else {
//				System.out.println("���Էº�Ź�帳�ϴ�.");
//			}

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
	
//		SportsCenter sport = service.memberserarch(memNum, sportsAry);
//		System.out.println(sport);
		
		SportsCenter sport = service.memberserarch2(memNum, sportsMap);
		System.out.println(sport);
		return null;
	}

	
	public static void enrollgroup() {
		System.out.println("��ϱ׷캰 ����Ʈ.");
		//SportsCenter[] resultAry = service.enrollgroup(sportsAry);
		service.enrollgroup2(sportsMap);
		
		
	}
}
