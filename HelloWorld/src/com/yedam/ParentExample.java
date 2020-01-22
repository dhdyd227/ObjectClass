package com.yedam;
//부모, 자식 상속 !!
class Parent{
	void method1() {
		System.out.println("부모클래스의 메소드1.");
	}
	void method2() {
		System.out.println("부모클래스의 메소드2.");
	}

}

class Child extends Parent{

	@Override
	void method1() {
		//super.method1();
		System.out.println("자식클래스의 메소드1.");
	}

	@Override
	void method2() {
		//super.method2();
		System.out.println("자식클래스의 메소드2.");
	}
	
	void method3() {
		System.out.println("자식클래스의 메소드3.");	
	}
	
}

public class ParentExample {
	public static void main(String[] args) {
		Child c1 = new Child();
		//c1.method1();
		//c1.method2();
		//c1.method3();

		Parent p1 =c1; //자식값을 부모에 담음
		
		//p1.method1(); //자식값에 오바라이딩 한 값이 출력됨(부모 값에 자식 값을 담을 수 있다.
		//p1.method2();
		
		if(p1 instanceof Child)
		{
			c1=(Child)p1; //부모에 자식 값을 담고 형변환 가능
			c1.method1();
			c1.method2();
			c1.method3();
			
			
		}
		
		Parent p2 = new Parent();
		
		//p2.method1();
		//p2.method2();
		if(p2 instanceof Child)
		{
			c1 = (Child) p2; //부모에 자식 값을 안담고 형변환 불가능
			c1.method1();
			c1.method2();
			c1.method3();
		}
		
	}
}
