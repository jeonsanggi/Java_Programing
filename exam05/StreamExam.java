package com.jremind.exam05;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class StreamExam {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("서울", "대전" ,"부산");
		
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			String city = iterator.next();
			System.out.println(city);
		}
		System.out.println();
		
		Stream<String> stream = list.stream();
		stream.forEach(s -> System.out.println(s));
	}
}
