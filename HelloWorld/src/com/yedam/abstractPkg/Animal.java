
package com.yedam.abstractPkg;

public abstract class Animal {
	public String kid;
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	public abstract void sound(); //추상메소드 정의되면안됨

}

class Cat extends Animal{

	@Override
	public void sound() { //abstract이기에 무조건 재정의 해야됨.
		System.out.println("야옹");
	}
	
}
class Dog extends Animal{

	@Override
	public void sound() {
		System.out.println("멍멍");
	}
	
}