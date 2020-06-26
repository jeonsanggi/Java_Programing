package com.jremind.exam05;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionMain {
	public static void main(String[] args) {
		// 생성자 참조
		// new는 생성자를 호출하는 키워드. Member의 생성자를 호출
		Function<String, Member> function1 = Member::new;
		Member member1 = function1.apply("java8");
		member1.printStatus();
		
		// 생성자 참조
		// new는 생성자를 호출하는 키워드. Member의 생성자를 호출
		BiFunction<String, String, Member> function2 = Member::new;
		Member member2 = function2.apply("홍길동", "java8");
		member2.printStatus();
		
		
		int x = 10;
		
		System.out.println(++x);
		System.out.println(x++);
		System.out.println(x);
	}
}
