package com.yedam.interfacePkg;

public class RemoteControlExample {
	
	public static void main(String[] args) {
		RemoteControl rc = null;
		rc = new Television();
		System.out.println(rc.hashCode());
		rc.turnOn();
		rc.setVolume(12);
		rc.turnOff();
		System.out.println("==========");
		rc = new Audio();
		System.out.println(rc.hashCode());
		rc.turnOn();
		rc.setVolume(12);
		rc.turnOff();
		
		RemoteControl rc1 = new RemoteControl() {
			int volume;
			@Override
			public void turnOn() {
				System.out.println("ÀÍ¸í ±¸Çö °´Ã¼¸¦ ÄÕ´Ï´Ù.");
			}
			@Override
			public void turnOff() {
				System.out.println("ÀÍ¸í ±¸Çö °´Ã¼¸¦ ²ü´Ï´Ù.");

			}
			@Override
			public void setVolume(int volume) {	
				this.volume = volume;
			}
		};
		rc1.turnOn();
		rc1.turnOff();
		
	}

}
