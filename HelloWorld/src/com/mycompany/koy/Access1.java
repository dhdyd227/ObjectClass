package com.mycompany.koy;

class Access2 {
	public Access2() {
		System.out.println("Access2");
	}

}

public class Access1 {
	public int field1;
	int field2;
	private int field3;
	public void method1() {
		this.field3=10;
		System.out.println("method1");
	}
	private void method2() {
		System.out.println("method2");
	}
	private void method3() {
		System.out.println("method3");
	}
	public Access1() {
		System.out.println("Access1");
	}
}
