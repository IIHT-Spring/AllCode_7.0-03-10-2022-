package com.functional.interfaces;

interface Message {
	void print(String msg); // abstract 
	
	// as many as object class methods as you want 
	String toString();
	boolean equals(Object obj);
	int hashCode();
}

public class Example1 {

	public void print(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		Example1 e1 = new Example1();
		e1.print("asdasdasd");

	}
}
