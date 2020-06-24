package com.jremind.exam02;

public class Car2Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Convertible mustang = new Convertible("쉐보래", "검정");
		
		System.out.println("모델: " + mustang.model);
		System.out.println("색상: " + mustang.color);
		
		mustang.drive();
		mustang.stop();
		mustang.openRoof();
		mustang.closeRoof();
		System.out.println(mustang.toString());
	}

}
