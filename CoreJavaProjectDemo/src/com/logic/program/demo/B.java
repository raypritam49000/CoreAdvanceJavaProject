package com.logic.program.demo;

interface A {
    public void show();
}

public class B implements A{

	@Override
	public void show() {
		System.out.println("This is Show Method ...");
	}
	
	void display() {
		System.out.println("This is Display Method ...");
	}
	
	public static void main(String[] args) {
		A a = new B();
		a.show();
		
//		a.display();
	}
	
}
