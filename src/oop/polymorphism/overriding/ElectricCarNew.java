package oop.polymorphism.overriding;

import oop.objectAndClass.Car;

public class ElectricCarNew extends Car{

	int batteryLife;
	
	@Override
	public void drive() {
		System.out.println("Driving the Car");
	}
}
