package com.yedam.lambda;

import java.util.function.IntSupplier;

public class Lambda717p4 {
	public static int method(int x, int y) {
		IntSupplier supplier = ()->{
		//	x *=10; 람다식에서는 finally로 선언되어 값을 변경할 수 없다.
			int result = x + y;
			return result;
		};
		int result = supplier.getAsInt();
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(method(3,5));
	}
	

}
