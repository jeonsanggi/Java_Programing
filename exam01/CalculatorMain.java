package com.jremind.exam01;

public class CalculatorMain {

	public static void main(String[] args) {
//		Calculator calc = new Calculator();
//		
//		double result1 = calc.areaRectangle(10);
//		double result2 = calc.areaRectangle(10, 20);
//		
//		System.out.println("정사각형 넓이: " + result1);
//		System.out.println("직사각형 넓이: " + result2);
		
		
		double result1 = 10 * 10 * Calculator2.pi;
		int result2 = Calculator2.plus(10, 20);
		int result3 = Calculator2.minus(10, 5);
		
		System.out.println("result1: " + result1);
		System.out.println("result1: " + result2);
		System.out.println("result1: " + result3);
	}

}
