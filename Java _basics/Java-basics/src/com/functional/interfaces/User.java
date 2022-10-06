package com.functional.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class User {

	String name;
	String role;

	User(String n, String r) {
		name = n;
		role = r;
	}

	public String getName() {
		return name;
	}

	public String getRole() {
		return role;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", role=" + role + "]";
	}

	public static void main(String[] args) {
		List<User> users = new ArrayList<>();
		users.add(new User("Nishant", "senior-dev"));
		users.add(new User("Vikas", "junior-dev"));
		users.add(new User("Kaushal", "senior-dev"));
		users.add(new User("Ajay", "senior-dev"));
		users.add(new User("Rohit", "junior-dev"));
		users.add(new User("Vishal", "junior-dev"));
		List seniors = process(users, (User u) -> u.getRole().equals("senior-dev"));
		System.out.println(seniors);

	}

	private static List process(List<User> users, Predicate<User> predicate) {
		List<User> result = new ArrayList<>();
		for (User user : users)
			if (predicate.test(user))
				result.add(user);
		return result;
	}

}
