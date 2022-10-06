package com.lambda.supplier;

import java.util.function.Supplier;

public class GetDEmo {
	

	
	public static void main(String[] args) {
		
		// function to generate a random value 
		Supplier<Double> randomNumber = () -> Math.random();
		System.out.println(randomNumber.get());
	}

}
