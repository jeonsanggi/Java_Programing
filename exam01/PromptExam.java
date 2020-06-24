package com.jremind.exam01;

public class PromptExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length !=2) {
			System.out.println("프로그램 사용볍");
			System.out.println("java 프로그램명 숫자1 숫자2");
			System.exit(0);
		}
		
		String str1 = args[0];
		String str2 = args[1];
		
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
	}
}
