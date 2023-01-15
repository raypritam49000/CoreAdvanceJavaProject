package com.function_interface.demo;

public class App {
	public static void main(String[] args) {
		Sum add = (int a, int b) -> System.out.println("Sum is : "+(a + b));
		add.sum(10, 20);
	}
}
