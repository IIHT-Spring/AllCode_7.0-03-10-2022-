package com.lambda.method;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.io.*;

class User {
	private String name;
	private Integer age;

	// constructor
	public User(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public Integer getAge() {
		return age;
	}
}

public class StaticMethod {

	// static method to compare by age
	public static int compareByAge(User A, User B) {
		return A.getAge().compareTo(B.getAge());
	}

	public static void main(String[] args) {

		List<User> userList = new ArrayList<>();

		userList.add(new User("Nishant", 32));
		userList.add(new User("Rohit", 33));
		userList.add(new User("Vicky", 35));
		userList.add(new User("Raghav", 39));

		Collections.sort(userList, StaticMethod::compareByAge);

		System.out.println("Sort by age : ");

		// using the stream over the object

		userList.stream().map(x -> x.getName()).forEach(System.out::println);

	}

}
