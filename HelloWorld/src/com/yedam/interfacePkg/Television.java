package com.yedam.interfacePkg;

public class Television implements RemoteControl{

	int volume;
	@Override
	public void turnOn() {
		System.out.println("�ڸ������� �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("�ڸ������� ���ϴ�.");
	}

	@Override
	public void setVolume(int volume) {
		this.volume = volume;
		System.out.println("");
	}

}
