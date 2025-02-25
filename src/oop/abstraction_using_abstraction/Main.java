package oop.abstraction_using_abstraction;

public class Main {

	public static void main(String[] args) {
		 
		Car car = new Car();
		
		car.color = "red";
		
		car.drive();
		
		car.key();
		car.seats(5);
		System.out.println(Vehicle.number);
	}
}
