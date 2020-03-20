package com.studentDatabase;

import subpackage.StudentDatabase;
import subpackage.StudentDatabaseException;
import subpackage.FileStudentDatabase;

public class mainFront {

	public static void main(String[] args) {
		StudentDatabase sd = new FileStudentDatabase();

		try {
			sd.addStudent("12345");

			String[] students = sd.readAllStudents();
			for (String student : students) {
				System.out.println(student);
			}

		} catch (StudentDatabaseException e) {
			System.out.println("Es ist ein Fehler aufgetreten!");
			e.printStackTrace();
		}

	}

}
