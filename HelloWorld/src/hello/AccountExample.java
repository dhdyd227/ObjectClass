package hello;

import java.util.Scanner;

public class AccountExample {
	private static Account[] accountArray = new Account[100];
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("------------------------");
			System.out.println("1.���»��� 2.���¸�� 3.���� 4.��� 5.����");
			System.out.println("------------------------");
			int menu = sc.nextInt();
			 sc.nextLine();
			if (menu == 1) { //���»���
				createAccount();
			} else if (menu == 2) {
				getAccountList();
			} else if (menu == 3) {// id password �̸�,���̸����
				deposit();
			} else if (menu == 4) {
				withdraw();
			} else if (menu == 5)
				run = false;
		}
	}

	// ���� �ν��Ͻ��� ����� �޼ҵ�.
	public static void createAccount() {
		System.out.println("createAccount()");
		System.out.println("���¹�ȣ �Է�: ");
		String accountNO=sc.nextLine();
		System.out.println("����ڸ� �Է�: ");
		String accountName=sc.nextLine();
		System.out.println("ù ���� �ݾ�: ");
		int accountBalance = sc.nextInt();
		
		Account accnt = new Account(accountNO,accountName,accountBalance);
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i] == null) {
			accountArray[i]=accnt;
			break;}
			
		}
		
	}

	// ���� ����Ʈ�� ��ȸ�ϴ� �޼ҵ�.
	public static void getAccountList() {
		System.out.println("getAccountList() ");
		for(Account a : accountArray) {
			if(a != null )
			System.out.println("���¹�ȣ: "+a.getAno() + ", ������: "+a.getOwner() + "�ܾ�: "+a.getBalance());
		}
	}

	// �Ա�
	public static void deposit() {
		System.out.println("deposit() ");
		System.out.println("���¹�ȣ �Է�: ");
		String accntNo = sc.nextLine();
		
		System.out.println("�Աݾ�: ");
		int accntBalance = sc.nextInt();
		
		for(Account acct : accountArray) {
			if(acct !=null && acct.getAno().equals(accntNo)) {
				acct.setBalance(accntBalance);
			}
					
		}
		
	}

	// ���.
	public static void withdraw() {
		System.out.println("withdraw()");
		System.out.println("deposit() ");
		System.out.println("���¹�ȣ �Է�: ");
		String accntNo = sc.nextLine();
		
		System.out.println("��ݾ�: ");
		int accntBalance = sc.nextInt();
		
		for(Account acct : accountArray) {
			if(acct !=null &&acct.getAno().equals(accntNo)) {//acct !=null && 
				acct.setBalance(-accntBalance);
			}
					
		}
		
		
	}

	public static Account findAccount(String ano) {
		System.out.println("findAccount(String ano)");

		return null;
	}

}
