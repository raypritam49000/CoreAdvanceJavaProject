package com.logic.program.demo;

class Parent {
	public void show() {
		System.out.println("This is Parent Show Method ...");
	}

	public void display() {
		System.out.println("This is Parent Display Method ...");
	}
}

public class Child extends Parent {
	
    @Override
    public void show() {
    	System.out.println("This is Child Show Method ...");
    }
    
    @Override
    public void display() {
    	System.out.println("This is Child Display Method ...");
    }
    
    public static void main(String[] args) {
		Child child = new Child();
		child.display();
		child.show();
		
		Parent parent = new Child();
		parent.display();
		parent.show();
	}
}
