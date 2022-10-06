package com.lambda.consumer;

import java.util.function.Consumer;
import java.util.*;


public class AcceptDemo {
	public static void main(String[] args) {
		
		// how to create a consumer
		Consumer<Integer> display =  a -> System.out.println(a);
		// implemented the display method using accept 
		display.accept(100);
		
		
		// consumer to display a list of numbers 
		Consumer<List<Integer>>
		displayList = list -> list.stream().forEach(a -> System.out.println(a  + " "));
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(43);
		list.add(65);
		
		;
		
		displayList.accept(list);
	}

}
