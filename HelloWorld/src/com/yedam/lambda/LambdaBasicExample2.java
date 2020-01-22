package com.yedam.lambda;

interface MyInterfaceNoArgs {
	public void method1();
}

interface MyInterfaceWithArgs {
	public void method2(int a);
}

interface MyInterfaceWithreturn {
	public int method3(int a, int b);
}

public class LambdaBasicExample2 {
	public static void main(String[] args) {
		MyInterfaceNoArgs fina = () -> System.out.println("no arguments expression");
		
		fina.method1();

		MyInterfaceWithArgs fiwa = (a) -> {
			System.out.println("result is " + (a * 3));
		};
		fiwa.method2(5);

		MyInterfaceWithreturn fiwr = (a,b)->{
			return a+b;
		};
		int result = fiwr.method3(5, 10);
		System.out.println("결과 값은: "+result);
	}

}
