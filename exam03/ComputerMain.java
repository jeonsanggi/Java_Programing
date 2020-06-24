package com.jremind.exam03;

public class ComputerMain {
	public static void main(String[] args) {
		int radius = 10;
		Calculator cal = new Calculator();
		System.out.println("원면적: " + cal.areaCircle(radius));
		System.out.println();
		
		Computer com = new Computer();
		System.out.println("원면적: " + com.areaCircle(radius));
				
	}
}
