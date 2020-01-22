package com.yedam.example2;

import com.yedam.example.HankookTire;
import com.yedam.example.KumhoTire;

public class CarExample2 {
	public static void main(String[] args) {
		Car2 car2 = new Car2();
		
		for(int i=0;i<10;i++) {
			int problemLocation=car2.run();		
		
			switch(problemLocation) {
			case 1:
				System.out.println("�տ��� Hankook Ÿ�̾�� ��ü.");
				car2.tire[0] = new HankookTire("�տ���",15);
		
				break;
			case 2:
				System.out.println("�տ����� Kumho Ÿ�̾�� ��ü");
				car2.tire[1] = new KumhoTire("�տ�����",17);
				break;
			case 3:
				System.out.println("�ڿ��� Hankook Ÿ�̾�� ��ü");
				car2.tire[2] = new HankookTire("�ڿ���",16);
				break;
			case 4:
				System.out.println("�ڿ����� Kumho Ÿ�̾�� ��ü");
				car2.tire[3] = new KumhoTire("�ڿ�����",15);
				break;
			}
			System.out.println("=================================");
		}
	
	}

}
