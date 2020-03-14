package com.Scanner;

import java.util.Scanner;

public class Scanning {

	public static void main(String[] args) {
		String firstName;
        String lastName;
        
        try (Scanner input = new Scanner (System.in)) {
			System.out.println("Bitte gebe deinen Vornamen ein:");
			firstName = input.next();
			// Hier Vornamen einlesen!
			
			System.out.println("Bitte gebe deinen Nachnamen ein:");
			lastName = input.next();
			// Hier Nachnamen einlesen!
		}
        
        System.out.println("Welcome, " + firstName + " " + lastName);
        // Hier Willkommens-Nachricht ausgeben.
        // Beispielsweise soll für Max Mustermann ausgegeben werden: 
        /** Welcome, Max Mustermann */

	}

}
