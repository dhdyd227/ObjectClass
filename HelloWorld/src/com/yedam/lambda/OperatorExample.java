package com.yedam.lambda;

import java.util.function.IntBinaryOperator;

public class OperatorExample {
	static int[] scores = { 92, 95, 87 };

	static int mixOrMax(IntBinaryOperator oper) {
		int result = scores[0];
		for (int score : scores) {
			result = oper.applyAsInt(result, score); 
		}
		return result;
	}

	public static void main(String[] args) {
		
		
		IntBinaryOperator oper = (left,right)-> {
			int result = 0;
			result = (left >= right ? left : right);
				return result;
			};
			
			
		IntBinaryOperator oper2 = new IntBinaryOperator() {
			int result = 0;
			@Override
			public int applyAsInt(int left, int right) {
				result = (left <= right ? left : right);
				return result;
			}

		};
	
//		int result = mixOrMax(oper);
//		System.out.println("max:" + result);
//		
//		result = mixOrMax(oper2);
//		System.out.println("min:" + result);
	}

}
