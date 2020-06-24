package com.jremind.exam03;

public class Car2Main {

	public static void main(String[] args) {
		Car2 sedan = new Car2(new GasolineEngineImple());
		sedan.drive();
		
		Car2 truck = new Car2(new DieselEngineImpl());
		truck.drive();
	}
}
