package com.jremind.exam04;

public class MemberMain {
	public static void main(String[] args) {
		Member m1 = new Member("JAVA");
		Member m2 = new Member("JAVA");
		Member m3 = new Member("C++");
				
		if(m1.equals(m2)) {
			System.out.println("m1:m2 �� ��ü�� ���� ����Դϴ�.");
		}else {
			System.out.println("m1:m2 �� ��ü�� �ٸ� �ɹ��Դϴ�.");
		}
		
		if(m1.equals(m3)) {
			System.out.println("m1:m3 �� ��ü�� ���� ����Դϴ�.");
		}else {
			System.out.println("m1:m3 �� ��ü�� �ٸ� ����Դϴ�.");
		}
		
	}

}
