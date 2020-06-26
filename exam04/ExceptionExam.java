package com.jremind.exam04;

public class ExceptionExam {
	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;
		
		try {
			data1 = args[0];
			data2 = args[1];
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("매개변수 값이 부족합니다.");
		}finally {
			System.out.println("Finally!!!");
		}
	}
}
