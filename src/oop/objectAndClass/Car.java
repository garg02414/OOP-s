package oop.objectAndClass;

public class Car {

	public String color;
	public String model;
	public int year;
	
	
	public void start() {
		System.out.println("Car Started");
	}
	
	//method Overloading
	public void start(String key) {
		System.out.println("Car Started using " + key);
	}
	
	public void stop() {
		System.out.println("Car Stopped");
	}
	
	public void drive() {
		System.out.println("Drive Car");
	}
}
