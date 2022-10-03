package com.lambda;

interface printDesigination {
	public String publish(String Desigination);
}

public class WithParameter {
	public static void main(String[] args) {
		
		printDesigination d1 = (Desigination) -> {return "Your Desgination is " + Desigination;};
		System.out.println(d1.publish("Senior DEV"));
	}
}
