package com.jremind.exam03;

public class GasolineEngine extends Engine{
	GasolineEngine(int cylinder, String oil){
		super(cylinder, oil);
	}
	
	@Override
	public void runEngine() {
		System.out.println("부르릉~~~~!!");
	}

}
