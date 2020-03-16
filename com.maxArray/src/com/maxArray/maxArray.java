package com.maxArray;

public class maxArray {

	public static void main(String[] args) {
		int arr[] = { 12, 55, 87, 99, 32 };
		int max = 0;

		for (int Element : arr) {
			if (max < Element) {
				max = Element;
			}
		}
		System.out.println(max);
	}

}
