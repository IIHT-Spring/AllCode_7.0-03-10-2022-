package com.lambda;

interface printName1 {
	public void prints();
}
public class WithLambda {
	
	public static void main(String[] args) {
		String name = "Nishant";
		
		// with lambda function
		printName1 Myname=()-> {
			System.out.println("Printing name " + name);
		};
		Myname.prints();
	}



}
