package com.jremind.exam03;

public abstract class Animal {
	public String kind;
	public void live() {
		System.out.println("먹고 찐다");
	}
	
	public abstract void sound();
}
