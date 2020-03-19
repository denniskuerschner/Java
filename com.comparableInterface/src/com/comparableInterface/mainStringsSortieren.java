package com.comparableInterface;

import java.util.Arrays;

import io.packageStringsSortieren.Car;

public class mainStringsSortieren {

	public static void main(String[] args) {
		Car[] cars = new Car[3];
		cars[0] = new Car("XYZ", 200);
		cars[1] = new Car("ZYX", 200);
		cars[2] = new Car("ABC", 200);
		
		Arrays.sort(cars);
		
		for (Car car : cars) {
			System.out.println(car.getBrand() + ": " + car.getHp());
		}
		
	}

}
