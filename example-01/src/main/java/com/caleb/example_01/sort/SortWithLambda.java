package com.caleb.example_01.sort;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortWithLambda {

	public static void main(String[] args) {

		List<Developer> listDevs = getDevelopers();

		System.out.println("Before Sort");
		for (Developer developer : listDevs) {
			System.out.println(developer);
		}

		System.out.println("After Sort");

		// lambda here!
		listDevs.sort((Developer o1, Developer o2) -> o1.getAge() - o2.getAge());

		// java 8 only, lambda also, to print the List
		listDevs.forEach((developer) -> System.out.println(developer));

		System.out.println("Sort by name");

		// order by name
		listDevs.sort((Developer d1, Developer d2) -> d1.getName().compareTo(d2.getName()));
		listDevs.forEach((dev) -> System.out.println(dev));

		System.out.println("Sort by salary");

		// order by salary
		listDevs.sort((Developer d1, Developer d2) -> d1.getSalary().compareTo(d2.getSalary()));
		listDevs.forEach((dev) -> System.out.println(dev));

		System.out.println("Sort by name reverse");
		
		// order by name reverse
		Comparator<Developer> nameComparator = (d1, d2) -> d1.getName().compareTo(d2.getName());
		listDevs.sort(nameComparator.reversed());
		listDevs.forEach((dev) -> System.out.println(dev));
	}

	private static List<Developer> getDevelopers() {

		List<Developer> result = new ArrayList<Developer>();

		result.add(new Developer("mkyong", new BigDecimal("70000"), 33));
		result.add(new Developer("alvin", new BigDecimal("80000"), 20));
		result.add(new Developer("jason", new BigDecimal("100000"), 10));
		result.add(new Developer("iris", new BigDecimal("170000"), 55));

		return result;
	}
}
