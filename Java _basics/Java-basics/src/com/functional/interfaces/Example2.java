package com.functional.interfaces;

interface Square {
	public void sqaure(int num1);

	// default method
	default void print() {
		System.out.println("Default method has been executed");
	}
}

public class Example2 implements Square {

	@Override
	public void sqaure(int num1) {
		System.out.println("The square of the number " + num1 + " is: " + num1 * num1);

	}
	public static void main(String[] args) {
		Example2 e2 = new Example2();
		e2.sqaure(25);

		e2.print();

	}

	
	// example 3 
	// define an interface calculate 
	// methods for adding 2 numbers
	// multiplying 
	// difference
	// division 
	// implement all the methods 
	
}
