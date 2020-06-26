package com.jremind.exam04;

public class StringBuilderExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		
		sb.append("Java ");
		sb.append("Class");
		sb.insert(5, "Programming");
		
		System.out.println("¹®ÀÚ¼ö: " + sb.length());
		System.out.println(sb.toString());
	}

}
