package oop.abstraction_using_abstraction;

public abstract class Vehicle {
	public static final int number = 1;

	public abstract void drive();
	
	public void key() {
		System.out.println("default key");
	}
	
	public abstract String seats(int person);
}
