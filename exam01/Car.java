package com.jremind.exam01;

public class Car {
	String company = "Volvo";
	String model = "XC90";
	String color = "black"; 
	int horsePower = 175;
	
	Car(){}
	
	Car(String company){
		this.company = company;
	}
	
	Car(String company, String model){
		this(company);
		this.model = model;
	}
	
	Car(String company, String model, String color){
		this(company, model);
		this.color = color;
	}
	
	
	Car(String company, String model, String color, int horserPower){
		this(company, model, color);
		this.horsePower = horserPower;
	}
	
	void printFields() {
		System.out.println(this.company + " "+ this.model + " "+ this.color + " "+this.horsePower);
		
	}
}
