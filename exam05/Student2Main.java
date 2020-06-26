package com.jremind.exam05;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class Student2Main {
	private static List<Student2> list = Arrays.asList(
			new Student2("ȫ�浿", 95, 80),
			new Student2("�̼���", 90, 85)
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

		System.out.println("[�л��̸�]");
		// ���ٿ��� t�� �Ű����� "->"�� �޼ҵ�
		// printString(t -> t.getName()) �ڵ带 Ǯ��� 
		// Function<Student2, String> f = t -> t.getName()
		// printString(f) �� ����
		printString(t -> t.getName()); //�޼ҵ带 ������ ��ü�� ����
		
		System.out.println("[��������]");
		printInt(t -> t.getEnglishScore());
		
		System.out.println("[��������]");
		printInt(t-> t.getMathScore());	
	}

}
