package com.yedam.lambda;
@FunctionalInterface   //interface 에 function이 하나만 있어야된다.
interface MyInterface{
	int print(int a,int b);
}
class MyInterfaceClass implements MyInterface{
	@Override
	public int print(int a, int b){
		return a+b;
	}
}
public class LambdaBasicExample {
	public static void main(String[] args) {
		MyInterface mi = new MyInterfaceClass();
		int result=mi.print(4,9);
		System.out.println("결과 값은: "+result);
		
		mi = (a,b)-> {
				return a*b;
			};
			
		
		result = mi.print(3, 5);
		System.out.println("결과 값은: "+result);
		
		mi = new MyInterface() {
			@Override
			public int print(int a, int b) {
				return a-b;
			}
			
		}; 
		result = mi.print(7, 4);
		System.out.println("결과 값은: "+result);
		
		mi =(a,b)->{
			return a/b;
		};
		System.out.println("결과 값은: "+mi.print(8,4));
	}
	
	
}
