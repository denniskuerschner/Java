package com.magicArray;

public class vergleichArrayWerte {

	public static void main(String[] args) {
		int[][] arr = { { 2, 2, 5, 1 }, { 5, 5 }, { 7, 2, 1 } };

//Herangehensweise 1

		int summeGesamt1 = 0;
		int summeGesamt2 = 0;
		int summeGesamt3 = 0;

		for (int i = 0; i < 4; i++) {
			summeGesamt1 += arr[0][i];
		}
		for (int j = 0; j < 2; j++) {
			summeGesamt2 += arr[1][j];
		}
		for (int k = 0; k < 3; k++) {
			summeGesamt3 += arr[2][k];
		}
		if (summeGesamt1 == summeGesamt2 && summeGesamt1 == summeGesamt3) {
			System.out.println("Magic Array");
		} else {
			System.out.println("Simple Array");
		}

// Herangehensweise 2

		int[] sums = new int[arr.length];

		int counter = 0;
		for (int[] a : arr) {
			int sum = 0;
			for (int b : a) {
				sum = sum + b;
			}
			sums[counter] = sum;
			counter++;
		}

		boolean isMagicArray = true;
		int firstSumsValue = sums[0];
		for (int value : sums) {
			if (value != firstSumsValue) {
				isMagicArray = false;
			}
		}

		if (isMagicArray) {
			System.out.println("Magic Array");
		} else {
			System.out.println("Simple Array");
		}
	}

}
