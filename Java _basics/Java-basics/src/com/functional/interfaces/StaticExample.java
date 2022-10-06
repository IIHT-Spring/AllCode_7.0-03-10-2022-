package com.functional.interfaces;

interface SayName {
	// static method 
	static void say() {
		System.out.println("Hello my name is Nishant");
	}
	
	void age(int a);
}
public class StaticExample implements SayName {
	public static void main(String[] args) {
		StaticExample s1 = new StaticExample();
		SayName.say();
		
		
		s1.age(12);
	}
	@Override
	public void age(int a) {
		System.out.println(a);
		
	}
}
