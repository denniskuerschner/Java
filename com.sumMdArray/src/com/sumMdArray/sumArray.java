package com.sumMdArray;

import java.util.Arrays;

public class sumArray {

	public static void main(String[] args) {
		int[][] arr = { { 4, 2 }, { 9, 5, 2 }, { 1 } };
		int summeArray = 0;

		for (int[] a : arr) {
			for (int b : a) {
				summeArray += b;
			}

		}
		System.out.println(summeArray);
	}
}
