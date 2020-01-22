package hello;

public class Account {
	String ano;   //계좌번호
	String owner; //소유주
	int balance;  //잔액
	Account(){}

	public Account(String ano, String owner, int balance) {
		super();
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) { 
		this.ano = ano;
	}
	public String getOwner() {  
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance += balance;
	}

}
