package com.jremind.exam05;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class Student2Main {
	private static List<Student2> list = Arrays.asList(
			new Student2("홍길동", 95, 80),
			new Student2("이순신", 90, 85)
	);
	
	public static void printString(Function<Student2, String> function) {
		for(Student2 student: list) {
			System.out.println(function.apply(student));
		}
		System.out.println();
	}
	
	public static void printInt(ToIntFunction<Student2> function) {
		for(Student2 student: list) {
			System.out.println(function.applyAsInt(student));
		}
		System.out.println();
	}
	
	public static void main(String[] args) {

		System.out.println("[학생이름]");
		// 람다에서 t는 매개인자 "->"는 메소드
		// printString(t -> t.getName()) 코드를 풀어쓰면 
		// Function<Student2, String> f = t -> t.getName()
		// printString(f) 와 같음
		printString(t -> t.getName()); //메소드를 가지는 객체를 전달
		
		System.out.println("[영어점수]");
		printInt(t -> t.getEnglishScore());
		
		System.out.println("[수학점수]");
		printInt(t-> t.getMathScore());	
	}

}
