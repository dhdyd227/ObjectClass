package com.yedam;

public class CellPhone {
	String model;
	String color;
	
	public CellPhone() {
		//super();
		
	}
	public CellPhone(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}
	
	void powerOn() {
		System.out.println("������ �մϴ�.");
	}
	void powerOff() {
		System.out.println("������ ���ϴ�.");
	}
	void bell() {
		System.out.println("���� �︳�ϴ�.");
	}
	void hangUp() {
		System.out.println("��ȭ�� �����ϴ�.");
	}
	
}
