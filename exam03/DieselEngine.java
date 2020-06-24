package com.jremind.exam03;

public class DieselEngine extends Engine{
	public DieselEngine(int cylinder, String oil) {
		super(cylinder, oil);
	}

	@Override
	public void runEngine() {
		System.out.println("드르르르르르르륵~~!!!");
	}
	

}
