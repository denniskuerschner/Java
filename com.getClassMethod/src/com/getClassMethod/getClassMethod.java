package com.getClassMethod;

import io.cars.Car;

public class getClassMethod {

	public static void main(String[] args) {
		Car[] cars = new Car[3];
		cars[0] = new Car("XYZ", 150);
		cars[1] = new Car("ZYX", 200);
		cars[2] = new Car("ABC", 50);

		for (Car car : cars) {
			System.out.println(car.getBrand() + ": " + car.getHp());
		}

	}

}
