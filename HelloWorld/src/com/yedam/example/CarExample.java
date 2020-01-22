package com.yedam.example;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i=0;i<10;i++) {
			int problemLocation=car.run();		
		
			switch(problemLocation) {
			case 1:
				System.out.println("앞왼쪽 Hankook 타이어로 교체.");
				car.frontLeft = new HankookTire("앞왼쪽",15);
				break;
			case 2:
				System.out.println("앞오른쪽 Kumho 타이어로 교체");
				car.frontRight = new KumhoTire("앞오른쪽",17);
				break;
			case 3:
				System.out.println("뒤왼쪽 Hankook 타이어로 교체");
				car.frontRight = new HankookTire("뒤왼쪽",16);
				break;
			case 4:
				System.out.println("뒤오른쪽 Kumho 타이어로 교체");
				car.frontRight = new KumhoTire("뒤오른쪽",15);
				break;
			}
			System.out.println("=================================");
		}
	
	}

}
