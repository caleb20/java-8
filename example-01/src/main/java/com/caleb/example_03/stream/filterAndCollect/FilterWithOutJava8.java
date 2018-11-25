package com.caleb.example_03.stream.filterAndCollect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterWithOutJava8 {

	public static void main(String[] args) {

		List<String> lines = Arrays.asList("spring", "node", "mkyong");

		List<String> result = getFilterOutput(lines, "mkyong");

		result.forEach(System.out::println);
	}

	private static List<String> getFilterOutput(List<String> lines, String string) {
		List<String> result = new ArrayList<>();

		for (String line : lines) {
			if (!"mkyong".equals(line)) { // we dont like mkyong
				result.add(line);
			}
		}
		return result;
	}

}
