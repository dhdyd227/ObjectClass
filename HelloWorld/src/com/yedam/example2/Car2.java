package com.yedam.example2;

import com.yedam.example.Tire;

public class Car2 {
	Tire[] tire = { new Tire("�տ���", 6), new Tire("�տ�����", 2),
			new Tire("�ڿ���", 3), new Tire("�ڿ�����", 4) };

//	Tire frontLeft = new Tire("�տ���",6);
//	Tire frontRight = new Tire("�տ�����",2);
//	Tire backLeft = new Tire("�ڿ���",3);
//	Tire backRight = new Tire("�ڿ�����",4);

	int run() {

		System.out.println("[�ڵ����� �޸��ϴ�]");
		for (int i = 0; i < tire.length; i++) {
			if (tire[i].roll() == false) {
				stop();
				return (i+1);
			}
		}

		return 0;
	}

	void stop() {
		System.out.println("[�ڵ����� ����ϴ�.]");
	}
}
