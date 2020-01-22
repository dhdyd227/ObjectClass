package com.yedam.example;

public class Tire {
	int maxRotation; //��밡�����ִ� ȸ����.
	int accumulatedRotation; //������� ���� ������ ȸ����.
	String location; //���� ��ġ
	
	
	public Tire(String location,int maxRotation){
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	public boolean roll() {
		accumulatedRotation++;
		if(maxRotation>accumulatedRotation) {
			System.out.println(location + "Ÿ�̾� ����: "+(maxRotation-accumulatedRotation)+ " ȸ");
			return true;
		}
		else {
			System.out.println("***"+location+" Ÿ�̾� ��ũ ***");
			return false;
		}
	}
}
