package com.hashSet;

import java.util.HashSet;

public class hashSet {

	public static void main(String[] args) {

		HashSet<String> words = new HashSet<>(); 			 // no sorting in hashSet
		words.add("Erik");
		words.add("Erik"); 									// element "Erik" is just printed once in hashSet
		words.add("Anton");
		words.add("Monika");

		for (String student : words) {
			System.out.println(student);
		}

	}

}
