package com.caleb.example_03.stream.findAnyAndOrElse;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class NowJava8 {

	public static void main(String[] args) {

		List<Person> persons = Arrays.asList(new Person("mkyong", 30), new Person("jack", 20),
				new Person("lawrence", 40), new Person("jack", 50)

		);

		Person result1 = persons.stream().filter(x -> "jack".equals(x.getName())).findAny().orElse(null);
		System.out.println(result1);

		Person result2 = persons.stream().filter(x -> "ahmook".equals(x.getName())).findAny().orElse(null);
		System.out.println(result2);

		// Multiple filter
		Person result3 = persons.stream().filter(x -> "jack".equals(x.getName()) && 20 == x.getAge()).findAny()
				.orElse(null);
		System.out.println(result3);

		// or like this
		Person result4 = persons.stream().filter(p -> {
			if ("jack".equals(p.getName()) && 20 == p.getAge()) {
				return true;
			}
			return false;
		}).findAny().orElse(null);

		System.out.println("result 4 :" + result4);

		// Filter map
		String name = persons.stream().filter(x -> "jack".equals(x.getName())).map(Person::getName).findAny()
				.orElse("");

		System.out.println("name : " + name);

		System.out.println("----------------------");
		
		List<String> names = persons.stream().map(Person::getName).collect(Collectors.toList());
		names.forEach(System.out::println);
		
	}

}
