package com.jremind.exam03;

public class Car {
	private Engine engine;
	
	Car(Engine engine) {
		this.engine = engine;
	}
	
	public void drive() {
		engine.runEngine();
	}
}
