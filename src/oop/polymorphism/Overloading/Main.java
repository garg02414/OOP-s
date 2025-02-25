package oop.polymorphism.Overloading;

import oop.objectAndClass.Car;

public class Main {

	public static void main(String[] args) {

		Car car = new Car();

		car.start();
		car.start("key1");
//		we are overloading start method here t

	}
}
