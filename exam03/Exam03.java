package com.jremind.exam03;

public class Exam03 {
	public static void main(String[] args) {
		Student student = new Student("홍길동", "1111111-2222222", 10);
		System.out.println("name: " + student.name);
		System.out.println("ssn: " + student.ssn);
		System.out.println("student no: " + student.studentNo);
		
		Student student2 = new Student();
		System.out.println("name: " + student2.name);
		System.out.println("ssn: " + student2.ssn);
		System.out.println("student no: " + student2.studentNo);
	}
}
