package com.yedam.example;

public class HankookTire extends Tire{
	public HankookTire(String location, int maxRotation){
		super(location,maxRotation);
	}
	@Override
	public boolean roll() {
		this.accumulatedRotation++;
		if(maxRotation>accumulatedRotation) {
			System.out.println(location + "Hankook Ÿ�̾� ����: "+(maxRotation-accumulatedRotation)+ " ȸ");
			return true;
		}
		else {
			System.out.println("***"+location+"Hankook Ÿ�̾� ��ũ ***");
			return false;
		}
	}
}
