package com.bufferedReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class reading {

	public static void main(String[] args) {
		try (BufferedReader b = new BufferedReader(new FileReader("test.txt"))) {
			while (b.ready()) {
				String line = b.readLine();
				System.out.println(line);
			}
			b.close();

		} catch (FileNotFoundException e) {
			System.out.println("Beim Öffnen der Datei ist ein Fehler aufgetreten");
		} catch (IOException e) {
			System.out.println("Beim Auslesen der Datei ist ein Fehler aufgetreten");
		}

	}

}
