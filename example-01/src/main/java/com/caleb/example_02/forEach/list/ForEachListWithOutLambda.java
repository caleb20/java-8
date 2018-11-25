package com.caleb.example_02.forEach.list;

import java.util.ArrayList;
import java.util.List;

public class ForEachListWithOutLambda {

	public static void main(String[] args) {

		List<String> items = new ArrayList<String>();
		items.add("A");
		items.add("B");
		items.add("C");
		items.add("D");
		items.add("E");
		
		for(String item : items) {
			System.out.println(item);
		}
	}
}
