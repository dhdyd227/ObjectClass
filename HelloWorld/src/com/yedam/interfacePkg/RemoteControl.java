package com.yedam.interfacePkg;

public interface RemoteControl {
	//����ʵ�
	public static final int MAX_VALUE =10;
	int MIN_VALUE = 0;
	//�߻�޼ҵ�
	public abstract void turnOn();
	//����Ʈ �޼ҵ�
	public void turnOff();
	public void setVolume(int volume);
}
