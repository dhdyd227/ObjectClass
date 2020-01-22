package com.yedam.exception;

public class LoginExample {
	public static void main(String[] args) {
		try {
			login("blue","12345");
			System.out.println("로그인성공");
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
		//id가 "blue"가 아니라면 NotExistIDException 발생
		
		if(!id.equals("blue")) {
			throw new NotExistIDException("id 비일치");
		}
		
		//password가 "12345"가 아니라면 WrongPasswordException 발생
		if(!password.equals("12345")) {
			throw new WrongPasswordException("password 비일치");
		}
	
	
	}

}
