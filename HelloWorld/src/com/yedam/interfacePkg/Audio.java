package com.yedam.interfacePkg;

public class Audio implements RemoteControl{
	int volume;
	
	int a =MAX_VALUE;
	@Override
	public void turnOn() {
		System.out.println("Audio¸¦ ÄÕ´Ï´Ù.");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio¸¦ ²ü´Ï´Ù.");

	}

	@Override
	public void setVolume(int volume) {
		this.volume=volume;
	}
	

}
