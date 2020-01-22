package com.yedam;
//�θ�, �ڽ� ��� !!
class Parent{
	void method1() {
		System.out.println("�θ�Ŭ������ �޼ҵ�1.");
	}
	void method2() {
		System.out.println("�θ�Ŭ������ �޼ҵ�2.");
	}

}

class Child extends Parent{

	@Override
	void method1() {
		//super.method1();
		System.out.println("�ڽ�Ŭ������ �޼ҵ�1.");
	}

	@Override
	void method2() {
		//super.method2();
		System.out.println("�ڽ�Ŭ������ �޼ҵ�2.");
	}
	
	void method3() {
		System.out.println("�ڽ�Ŭ������ �޼ҵ�3.");	
	}
	
}

public class ParentExample {
	public static void main(String[] args) {
		Child c1 = new Child();
		//c1.method1();
		//c1.method2();
		//c1.method3();

		Parent p1 =c1; //�ڽİ��� �θ� ����
		
		//p1.method1(); //�ڽİ��� ���ٶ��̵� �� ���� ��µ�(�θ� ���� �ڽ� ���� ���� �� �ִ�.
		//p1.method2();
		
		if(p1 instanceof Child)
		{
			c1=(Child)p1; //�θ� �ڽ� ���� ��� ����ȯ ����
			c1.method1();
			c1.method2();
			c1.method3();
			
			
		}
		
		Parent p2 = new Parent();
		
		//p2.method1();
		//p2.method2();
		if(p2 instanceof Child)
		{
			c1 = (Child) p2; //�θ� �ڽ� ���� �ȴ�� ����ȯ �Ұ���
			c1.method1();
			c1.method2();
			c1.method3();
		}
		
	}
}
