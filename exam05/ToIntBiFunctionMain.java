package com.jremind.exam05;

import java.util.function.ToIntBiFunction;

public class ToIntBiFunctionMain {

	public static void main(String[] args) {
		ToIntBiFunction<String, String> function;
		
		function = (a, b) -> a.compareToIgnoreCase(b);
		print(function.applyAsInt("Hello World", "hello world"));
		
		//
		function = String::compareToIgnoreCase;
		print(function.applyAsInt("Hello World", "hello world"));

	}
	
	public static void print(int order){
		if(order == 0) {
			System.out.println("동일한 문자열입니다.");
		}
	}
}
