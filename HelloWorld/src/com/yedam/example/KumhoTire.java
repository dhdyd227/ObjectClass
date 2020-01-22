package com.yedam.example;

public class KumhoTire extends Tire{
	public KumhoTire(String location, int maxRotation){
		super(location,maxRotation);
	}
	@Override
	public boolean roll() {
		this.accumulatedRotation++;
		if(maxRotation>accumulatedRotation) {
			System.out.println(location + "KumhoTire Ÿ�̾� ����: "+(maxRotation-accumulatedRotation)+ " ȸ");
			return true;
		}
		else {
			System.out.println("***"+location+"KumhoTire Ÿ�̾� ��ũ ***");
			return false;
		}
	}
}
