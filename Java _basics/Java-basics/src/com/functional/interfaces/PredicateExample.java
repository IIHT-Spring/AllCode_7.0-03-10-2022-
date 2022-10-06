package com.functional.interfaces;

import java.util.function.Predicate;

public class PredicateExample {

	public static Predicate<String> hasLengthOf10 = new Predicate<String>() {

		@Override
		public boolean test(String t) {
			// TODO Auto-generated method stub
			return t.length() > 10;
		}

	};

	public static void predicate_or() {
		Predicate<String> containsLetterA = p -> p.contains("A");
		String containsA = "Apple";
		boolean outcome = hasLengthOf10.or(containsLetterA).test(containsA);
		System.out.println(outcome);

	}

	public static void main(String[] args) {

		// creating a predicate
		Predicate<Integer> isAnAdult = i -> (i > 18);

		Predicate<Integer> notAnAdult = i -> (i < 18);

		Predicate<Integer> isRetired = (i) -> (i > 60);

		// calling this predicate method 
//		boolean result = isAnAdult.and(isRetired).test(12);
//		System.out.println(result);

		predicate_or();

	}

}
