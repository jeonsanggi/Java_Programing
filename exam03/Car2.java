package com.jremind.exam03;

public class Car2 {
	private EngineInterface carEngine;
	
	Car2(EngineInterface carEngine){
		this.carEngine = carEngine;
	}
	
	public void drive() {
		carEngine.runEngine();
	}

}
