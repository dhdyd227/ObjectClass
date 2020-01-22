package com.yedam.lambda;

import java.util.function.IntBinaryOperator;

class Calculator {
	static int staticSum(int x, int y) {
		return x + y;
	}

	int instanceSum(int x, int y) {
		return x + y;
	}

}

public class MethodReferenceExample {
	public static void main(String[] args) {
		int a = 10, b = 20, result = 0;
		Calculator.staticSum(a, b);

		Calculator cal = new Calculator();
		cal.instanceSum(a, b);
		
		IntBinaryOperator oper = new IntBinaryOperator() { //static �޼ҵ�2
			@Override
			public int applyAsInt(int left, int right) {
				return Calculator.staticSum(left, right);
			}
			
		};
	
		oper = Calculator::staticSum;   //static �޼ҵ�2
		result = oper.applyAsInt(a, b);
		System.out.println("�����޼ҵ�����: "+result);
		
		
		oper = (x,y)->{
			return cal.instanceSum(x, y); //instance �޼ҵ�1
		};
		oper = cal::instanceSum; //  instance �޼ҵ�2
		result = oper.applyAsInt(b, a);
		System.out.println("�ν��Ͻ��޼ҵ�����: " + result);

	}

}
