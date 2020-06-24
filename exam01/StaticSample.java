package com.jremind.exam01;

public class StaticSample {
	int field1;
	void method1() {
		
	}
	
	
	static int field2;
	static void method2() {
		
	}
	
	static {
//		field1 = 10;
//		method1();
		field2 =10;
		method2();
	}
	
	static void method3() {
//		this.field2 =10;
//		this.method2();
		field2 = 20;
		method2();
	}
	
	static void method4() {
		StaticSample myInstance = new StaticSample();
		myInstance.field1 = 10;
		myInstance.method1();
	}

}
