package oop.abstraction_using_interface;

public class Main {

	public static void main(String[] args) {
		
		Car car = new Car();
		
		car.color = "red";
		
		car.drive();
		System.out.println(Drivable.number);
	}
}
