package com.jremind.exam02;

public class Convertible extends Car2{
	Convertible(String model, String color){
		this.model = model;
		this.color = color;
	}
	
	public void openRoof() {
		System.out.println("뚜껑연다!");
	}
	public void closeRoof() {
		System.out.println("뚜껑닫는다!");
	}
	
	
}
