package com.yedam.exception;

public class LoginExample {
	public static void main(String[] args) {
		try {
			login("blue","12345");
			System.out.println("�α��μ���");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			login("blue","54321");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	
	public static void login(String id,String password) throws NotExistIDException,WrongPasswordException{
		//id�� "blue"�� �ƴ϶�� NotExistIDException �߻�
		
		if(!id.equals("blue")) {
			throw new NotExistIDException("id ����ġ");
		}
		
		//password�� "12345"�� �ƴ϶�� WrongPasswordException �߻�
		if(!password.equals("12345")) {
			throw new WrongPasswordException("password ����ġ");
		}
	
	
	}

}
