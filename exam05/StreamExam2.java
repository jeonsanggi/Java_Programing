package com.jremind.exam05;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExam2 {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("홍길동", "남자", 90),
				new Student("이순신", "남자", 95)
		);
		
		Stream<Student> stream = list.stream();
		stream.forEach(t -> {
			String name = t.getName();
			int score = t.getScore();
			System.out.println(name + ": "+ score);
		});
		

	}
}
