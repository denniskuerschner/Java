package com.Continue;

public class Continue {

	public static void main(String[] args) {
		int i, n = 15;

		for (i = 1; i <= n; i++) {
			if (i % 3 == 0) {
				continue;
			} else {
				System.out.println(i);
			}
		}
	}

}
