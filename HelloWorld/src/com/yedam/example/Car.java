package com.yedam.example;

public class Car {
	Tire frontLeft = new Tire("�տ���",6);
	Tire frontRight = new Tire("�տ�����",2);
	Tire backLeft = new Tire("�ڿ���",3);
	Tire backRight = new Tire("�ڿ�����",4);
	
	int run() {
		System.out.println("[�ڵ����� �޸��ϴ�]");
		if(frontLeft.roll() == false) {
			stop();
			return 1; //���� �չ��� ������ �߻��ϸ� 1���� �����ڴ�.
		}else if(frontRight.roll() == false) {
			stop();
			return 2;//������ �չ��� ������ �߻��ϸ� 2���� �����ڴ�.
		}else if(backLeft.roll() == false) {
			stop();
			return 3;//���� �ڹ��� ������ �߻��ϸ� 3���� �����ڴ�.
		}else if(backRight.roll() == false) {
			stop();
			return 1;//������ �ڹ��� ������ �߻��ϸ� 4���� �����ڴ�.
		}
		return 0;
	}
	void stop() {
		System.out.println("[�ڵ����� ����ϴ�.]");
	}
}



