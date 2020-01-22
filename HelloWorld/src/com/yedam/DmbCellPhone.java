package com.yedam;

public class DmbCellPhone extends CellPhone {
	int channel;
	
	public DmbCellPhone(int channel) {
		super();
		this.channel = channel;
		
	}

	public DmbCellPhone(String model, String color,int channel) {
		super(model, color);
		this.channel=channel;
		
	}
	
	void turnOnDmb() {
		System.out.println("ä�� " + channel + "�� ��ۼ����� �����մϴ�.");
	}
	
	void changChannel(int channel) {
		this.channel = channel;
		System.out.println("ä�� "+ channel + "������ �����մϴ�");
	}
	
	void turnOffDmb() {
		System.out.println("DMB ����� �����մϴ�.");
	}
	

}
