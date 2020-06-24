package com.jremind.exam03;

public class Student extends Person{
	public int studentNo = 123;
	
	public Student() {
		//super();
	}
	
	public Student(String name, String ssn, int studentNo) {
		//자기 부모 생성자를 호출
		super(name, ssn);
		this.studentNo = studentNo;
	}
}
