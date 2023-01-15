package com.logic.program.demo;

public class Test {
	
	public void show(Object object) {
		System.out.println("This is Show Method with Object ...");
		System.out.println(object);
	}
	
	public void show(String string) {
		System.out.println("This is Show Method with String ...");
		System.out.println(string);
	}
	
	public void show(StringBuffer string) {
		System.out.println("This is Show Method with StringBuffer ...");
		System.out.println(string);
	}
	
	public static void main(String[] args) {
		Test test = new Test();
		test.show("Hello");
		//test.show(null);
		test.show(test);
		test.show(1);
	}
}
