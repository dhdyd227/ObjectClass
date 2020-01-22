package hello;

import java.util.Scanner;

public class AccountExample {
	private static Account[] accountArray = new Account[100];
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("------------------------");
			System.out.println("1.계좌생성 2.계좌목록 3.예금 4.출금 5.종료");
			System.out.println("------------------------");
			int menu = sc.nextInt();
			 sc.nextLine();
			if (menu == 1) { //계좌생성
				createAccount();
			} else if (menu == 2) {
				getAccountList();
			} else if (menu == 3) {// id password 이름,나이를출력
				deposit();
			} else if (menu == 4) {
				withdraw();
			} else if (menu == 5)
				run = false;
		}
	}

	// 계좌 인스턴스를 만드는 메소드.
	public static void createAccount() {
		System.out.println("createAccount()");
		System.out.println("계좌번호 입력: ");
		String accountNO=sc.nextLine();
		System.out.println("사용자명 입력: ");
		String accountName=sc.nextLine();
		System.out.println("첫 계좌 금액: ");
		int accountBalance = sc.nextInt();
		
		Account accnt = new Account(accountNO,accountName,accountBalance);
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i] == null) {
			accountArray[i]=accnt;
			break;}
			
		}
		
	}

	// 계좌 리스트를 조회하는 메소드.
	public static void getAccountList() {
		System.out.println("getAccountList() ");
		for(Account a : accountArray) {
			if(a != null )
			System.out.println("계좌번호: "+a.getAno() + ", 소유자: "+a.getOwner() + "잔액: "+a.getBalance());
		}
	}

	// 입금
	public static void deposit() {
		System.out.println("deposit() ");
		System.out.println("계좌번호 입력: ");
		String accntNo = sc.nextLine();
		
		System.out.println("입금액: ");
		int accntBalance = sc.nextInt();
		
		for(Account acct : accountArray) {
			if(acct !=null && acct.getAno().equals(accntNo)) {
				acct.setBalance(accntBalance);
			}
					
		}
		
	}

	// 출금.
	public static void withdraw() {
		System.out.println("withdraw()");
		System.out.println("deposit() ");
		System.out.println("계좌번호 입력: ");
		String accntNo = sc.nextLine();
		
		System.out.println("출금액: ");
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
