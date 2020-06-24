package com.jremind.exam02;

public class CarMain {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setSpeed(-50);
		System.out.println("속도: " + myCar.getSpeed());
		
		myCar.setSpeed(60);
		
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}

		System.out.println(myCar.getSpeed());
		System.out.println(myCar.isStop());
	}

}
