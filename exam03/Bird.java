package com.jremind.exam03;

public class Bird extends Animal{
	public Bird() {
		this.kind = "조류";
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("짹짹");
		
	}
	
}
