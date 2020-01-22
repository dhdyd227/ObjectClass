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
				System.out.println("앞왼쪽 Hankook 타이어로 교체.");
				car2.tire[0] = new HankookTire("앞왼쪽",15);
		
				break;
			case 2:
				System.out.println("앞오른쪽 Kumho 타이어로 교체");
				car2.tire[1] = new KumhoTire("앞오른쪽",17);
				break;
			case 3:
				System.out.println("뒤왼쪽 Hankook 타이어로 교체");
				car2.tire[2] = new HankookTire("뒤왼쪽",16);
				break;
			case 4:
				System.out.println("뒤오른쪽 Kumho 타이어로 교체");
				car2.tire[3] = new KumhoTire("뒤오른쪽",15);
				break;
			}
			System.out.println("=================================");
		}
	
	}

}
