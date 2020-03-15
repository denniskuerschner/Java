package com.Switch;

import java.util.Scanner;

public class Switching {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Bitte geben Sie einen Monat ein: ");
		String benutzerAuswahl = input.next();

		switch (benutzerAuswahl) {
		case "Januar":
		case "März":
		case "Mai":
		case "Juli":
		case "August":
		case "Oktober":
		case "Dezember":
			System.out.println("Der Monat hat 31 Tage");
			break;
		case "Februar":
			System.out.println("Der Monat hat 28 Tage");
			break;
		case "April":
		case "Juni":
		case "September":
		case "November":
			System.out.println("Der Monat hat 30 Tage");
			break;
		default:
			System.out.println("default");
		}
		System.out.println("Fertig!");
	}

}
