package com.jremind.exam05;

import java.util.function.IntBinaryOperator;

public class OperatorMain {
	private static int[] scores = {94, 96, 86};
	
	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		for(int score : scores) {
			//applyAsInt
			result = operator.applyAsInt(result, score);
		}
		return result;
	}
	
	public static void main(String[] args) {
		int max = maxOrMin(
				(a,b) ->{
					if(a >= b) 
						return a;
					else
						return b;
				}
		);
		
		System.out.println("최대값: " + max);
		
		int min = maxOrMin(
				(a, b) -> {
					if(a <= b)
						return a;
					else
						return b;
				}
		);
		System.out.println("최소값" + min);

	}
}
