package com.jremind.exam05;

public class Member {
	private String name = "�ƹ���";
	private String id = "����";
		
	public Member() {
		System.out.println("Member() ����");
	}

	public Member(String id) {
		System.out.println("Member(String id) ����");
		this.id = id;
	}
	
	public Member(String name, String id) {
		System.out.println("Member(String name, String id) ����");
		this.name = name;
		this.id = id;
	}

	public String getId() {
		return id;
	}
	
	public void printStatus() {
		System.out.println("name: " + name);
		System.out.println("id: " + id);
	}
}
