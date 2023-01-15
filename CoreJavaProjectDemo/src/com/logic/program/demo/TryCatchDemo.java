package com.logic.program.demo;

public class TryCatchDemo {
	
	@SuppressWarnings("finally")
	public int show() {
		try {
			System.out.println("Try Block....");
			return 1;
		} catch (Exception e) {
			System.out.println("Catch Block....");
			return 2;
		}
		finally {
			System.out.println("Finally Block....");
			return 3;
		}
	}

	public static void main(String[] args) {
		TryCatchDemo t = new TryCatchDemo();
		System.out.println(t.show());
	}
}
