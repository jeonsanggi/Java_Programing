package com.jremind.exam03;

public class ChildMain {

	public static void main(String[] args) {
		Parent parent = new Child();
		parent.parentField = "부모";		
		parent.method1();
		parent.method2();
		
//		parent.method3();
		
		if(parent instanceof Child) {
			Child child = (Child)parent;
			child.childField = "자식";
			child.method3();

		}
		
	}

}
