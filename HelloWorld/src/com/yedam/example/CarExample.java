package com.yedam.example;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i=0;i<10;i++) {
			int problemLocation=car.run();		
		
			switch(problemLocation) {
			case 1:
				System.out.println("�տ��� Hankook Ÿ�̾�� ��ü.");
				car.frontLeft = new HankookTire("�տ���",15);
				break;
			case 2:
				System.out.println("�տ����� Kumho Ÿ�̾�� ��ü");
				car.frontRight = new KumhoTire("�տ�����",17);
				break;
			case 3:
				System.out.println("�ڿ��� Hankook Ÿ�̾�� ��ü");
				car.frontRight = new HankookTire("�ڿ���",16);
				break;
			case 4:
				System.out.println("�ڿ����� Kumho Ÿ�̾�� ��ü");
				car.frontRight = new KumhoTire("�ڿ�����",15);
				break;
			}
			System.out.println("=================================");
		}
	
	}

}
