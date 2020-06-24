package com.jremind.exam01;

public class PersonMain {

	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567", "홍길동");
		
		System.out.println(p1.nationality);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
//		p1.nationality = "japan";
//		p1.ssn = "232323-23232321";
		p1.name = "박문수";
		
		System.out.println(p1.name);
				
				

	}

}
