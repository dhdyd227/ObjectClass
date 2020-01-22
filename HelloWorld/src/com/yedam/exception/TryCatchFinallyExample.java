package com.yedam.exception;

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;

		try {
			data1 = args[0];
			data2 = args[1];
			System.out.println("data1: " + data1);
			System.out.println("data2: " + data2);

			int val1 = Integer.parseInt(data1);
			int val2 = Integer.parseInt(data2);
			System.out.println("sum : " + (val1 + val2));

		} catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("매개값의 개수와 유형을 확인하세요.");
		} finally {
			System.out.println(" finally");

		}
		

		System.out.println("프로그램의 종료.");

	}

}
