package com.lambda;

interface printName {
	public void print();
}

public class WithoutLambda {

	public static void main(String[] args) {
		String name = "Nishant";

		// without lambda function i want implementation of the without using anonymous
		// class
 
		printName Myname = new printName() {

			@Override
			public void print() {
				// TODO Auto-generated method stub
				System.out.println("Printing name " + name);
			}
		};
		Myname.print();
	}
}
