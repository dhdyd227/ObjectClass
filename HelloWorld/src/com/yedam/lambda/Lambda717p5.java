package com.yedam.lambda;

import java.util.function.IntBinaryOperator;

public class Lambda717p5 {
	private static int[] scores = { 10, 50, 3};
	
	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		for(int score : scores) {
			result = operator.applyAsInt(result,  score);
		}
		return result;
	}
	
	public static void main(String[] args) {
		//최대값 얻기
		IntBinaryOperator oper = (left,right)-> {
			int result = 0;
			result = (left >= right ? left : right);
				return result;
			};
		int max = maxOrMin(oper);
		
		System.out.println("최대값: "+max);
				
		
		oper = (left,right)-> {
			int result = 0;
			result = (left <= right ? left : right);
				return result;
			};
		int min = maxOrMin(oper);
		
		System.out.println("최소값: "+min);
		
		
	}


}
