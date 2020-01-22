
package com.yedam.abstractPkg;

public abstract class Animal {
	public String kid;
	public void breathe() {
		System.out.println("���� ���ϴ�.");
	}
	
	public abstract void sound(); //�߻�޼ҵ� ���ǵǸ�ȵ�

}

class Cat extends Animal{

	@Override
	public void sound() { //abstract�̱⿡ ������ ������ �ؾߵ�.
		System.out.println("�߿�");
	}
	
}
class Dog extends Animal{

	@Override
	public void sound() {
		System.out.println("�۸�");
	}
	
}