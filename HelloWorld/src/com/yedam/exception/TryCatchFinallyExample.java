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
			System.out.println("�Ű����� ������ ������ Ȯ���ϼ���.");
		} finally {
			System.out.println(" finally");

		}
		

		System.out.println("���α׷��� ����.");

	}

}
