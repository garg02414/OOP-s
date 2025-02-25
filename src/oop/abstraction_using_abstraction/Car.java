package oop.abstraction_using_abstraction;

public class Car extends Vehicle {

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

	@Override
	public void drive() {
		System.out.println("Driving the Car");
		
	}
	
	@Override
	
	public void key() {
		System.out.println("my key");
	}

	@Override
	public String seats(int value) {
		System.out.println("inside seats mehod");
		return "hello";
	}
	
//	public void drive() {
//		System.out.println("Drive Car");
//	}
}
