package com.jremind.exam04;

public class BoxMain {
	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		box.setObject("ȫ�浿");
		String name = box.getObject();
		
		Box<Apple> box2 = new Box<Apple>();
		box2.setObject(new Apple());
		Apple apple = box2.getObject();
		

	}

}
