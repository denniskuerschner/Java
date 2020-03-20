package com.treeSet;

import java.util.Set;
import java.util.TreeSet;

public class treeSet {

	public static void main(String[] args) {

		Set<String> students = new TreeSet<>();
		students.add("Monika");
		students.add("XYZ");
		students.add("Erik");
		students.add("Erik");
		students.add("Anton");

		if (students.contains("Max")) {
			System.out.println("if erreicht");
		}

		for (String student : students) {
			System.out.println(student);
		}

	}

}
