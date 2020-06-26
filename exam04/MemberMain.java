package com.jremind.exam04;

public class MemberMain {
	public static void main(String[] args) {
		Member m1 = new Member("JAVA");
		Member m2 = new Member("JAVA");
		Member m3 = new Member("C++");
				
		if(m1.equals(m2)) {
			System.out.println("m1:m2 두 객체는 같은 멤버입니다.");
		}else {
			System.out.println("m1:m2 두 객체는 다른 맴버입니다.");
		}
		
		if(m1.equals(m3)) {
			System.out.println("m1:m3 두 객체는 같은 멤버입니다.");
		}else {
			System.out.println("m1:m3 두 객체는 다른 멤버입니다.");
		}
		
	}

}
