package com.yedam;

import com.yedam.example.Tire;

class Bus extends Vehicle{

	@Override
	void run() {
		System.out.println("������ �޸��ϴ�.");
	}
	
}

class Texi extends Vehicle{

	@Override
	void run() {
		System.out.println("�ýð� �޸��ϴ�.");
	}
	
}

public class Vehicle {
	String engine;
	String handle;
	Tire tire;
	
	void start() {
		System.out.println("���� ����մϴ�");
	}
	void run() {
		System.out.println("���� �޸��ϴ�");
	}
	void stop() {
		System.out.println("���� �����մϴ�");
	}
}
