package com.Substring;

public class letztesWort {

	public static void main(String[] args) {
		String test = "Hallo Welt";

		String lastWord = test.substring(test.lastIndexOf(" ") + 1);

		System.out.println(lastWord);
	}

}
