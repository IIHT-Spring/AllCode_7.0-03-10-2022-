package com.lambda.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class AndThenDemo {
	public static void main(String[] args) {
		// consumer to double every int of the list
		Consumer<List<Integer>> modify = list -> {
			for (int i = 0; i < list.size(); i++) {
				list.set(i, 2 * list.get(i));

			}
		};

		// consumer to display a list of numbers
		Consumer<List<Integer>> displayList = list -> list.stream().forEach(a -> System.out.println(a + " "));

		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(43);
		list.add(65);

		// using and then and accept

		modify.andThen(displayList).accept(list);

	}

}
