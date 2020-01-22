package com.yedam.exception;
class Account{
	private long balance;
	public Account() {}
	public long getBalance() {
		return balance;
	}
	public void deposit(int money) {
		balance += money;
	}
	public void withdraw(int money) throws BalanceInsufficientException {
		if(balance<money) {
			throw new BalanceInsufficientException("�ܰ����: "+ (money-balance)+"���ڶ��ϴ�.");
		}
		else
			balance -= money;
	}
}
public class AccountExample {
	public static void main(String[] args) {
		Account accnt=new Account();
		accnt.deposit(10000);
		System.out.println("���ݾ�: "+accnt.getBalance());
		
		try {
			accnt.withdraw(20000);
		} catch (BalanceInsufficientException e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		
		System.out.println("���α׷� ����.");
	}

}
