package com.jremind.exam05;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionMain {
	public static void main(String[] args) {
		// ������ ����
		// new�� �����ڸ� ȣ���ϴ� Ű����. Member�� �����ڸ� ȣ��
		Function<String, Member> function1 = Member::new;
		Member member1 = function1.apply("java8");
		member1.printStatus();
		
		// ������ ����
		// new�� �����ڸ� ȣ���ϴ� Ű����. Member�� �����ڸ� ȣ��
		BiFunction<String, String, Member> function2 = Member::new;
		Member member2 = function2.apply("ȫ�浿", "java8");
		member2.printStatus();
		
		
		int x = 10;
		
		System.out.println(++x);
		System.out.println(x++);
		System.out.println(x);
	}
}
