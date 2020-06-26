package com.jremind.exam05;

import java.util.ArrayList;
import java.util.List;

public class ListExam {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Java");
		list.add("C++");
		list.add("Python");
		list.add("C#");
		list.add("Objective-C");
		
		int size = list.size();
		System.out.println("�� ������ ��: " + size);
		System.out.println();
		
		String item = list.get(2);
		System.out.println("�ε��� 2�� �׸�: " + item + "\n");
		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ": " + str);
		}
		System.out.println();
		
		System.out.println();
		
		list.remove(2);
		list.remove(2);
		list.remove("C++");
		
		for(String s: list) {
			System.out.println(s);
		}

	}

}
