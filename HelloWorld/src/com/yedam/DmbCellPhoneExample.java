package com.yedam;

public class DmbCellPhoneExample {
	public static void main(String[] args) {
		DmbCellPhone dmbCell = new DmbCellPhone("S10", "white", 10);

		System.out.println("model: " + dmbCell.model);// �θ��ʵ�
		System.out.println("color: " + dmbCell.color); // �θ��ʵ�
		System.out.println("channel: " + dmbCell.channel); // �ڽ��ʵ�

		dmbCell.powerOn(); // �θ� �޼ҵ�
		dmbCell.turnOnDmb(); // �ڽ� �޼ҵ�
		dmbCell.turnOffDmb();
		dmbCell.powerOff();
	}

}
