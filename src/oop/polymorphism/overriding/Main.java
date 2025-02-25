package oop.polymorphism.overriding;

public class Main {

	public static void main(String[] args) {
		
		ElectricCarNew car = new ElectricCarNew();
		car.color = "Blue";
		car.model = "Toyota";
		car.year = 22;
		
		car.drive();
	}
}
