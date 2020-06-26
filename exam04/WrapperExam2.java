package com.jremind.exam04;

public class WrapperExam2 {

	public static void main(String[] args) {
//		int val1 = Integer.parseInt("10");
//		double val2 = Double.parseDouble("3.14");
//		boolean val3 = Boolean.parseBoolean("true");
//		
//		System.out.println(val1);
//		System.out.println(val2);
//		System.out.println(val3);
		
		Integer obj1 = 300;
		Integer obj2 = 300;
		
		System.out.println("==: " + (obj1==obj2));
		System.out.println("내부 값 비교:" + (obj1.intValue() == obj2.intValue()));
		System.out.println("equals:" + obj1.equals(obj2));

	}

}
