package oop.abstraction_using_interface;

public class Car implements Drivable{

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
		System.out.println("Car is Drivable");
		
	}


//	public void drive() {
//		System.out.println("Drive Car");
//	}
}
