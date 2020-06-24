package com.jremind.exam03;

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		SmartPhone phone = new SmartPhone("내폰");
//		phone.turnOn();
//		phone.internetSearch();
//		phone.turnOff();
		
		
		Dog jindoDog = new Dog();
		Bird sparrow = new Bird();
		
		System.out.println(jindoDog.kind);
		System.out.println("---------------------");
		
		animalSound(new Dog());
		animalSound(new Bird());

	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}

}
