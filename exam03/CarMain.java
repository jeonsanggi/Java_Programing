package com.jremind.exam03;

public class CarMain {
	public static void main(String[] args) {
		Engine myEngine = new GasolineEngine(4, "gasoline");
		Engine youEngine = new DieselEngine(4, "diesel");
		
		Car myCar = new Car(myEngine);
		Car youCar = new Car(youEngine);
		
		myCar.drive();
		youCar.drive();

	}

}
