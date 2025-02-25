package oop.Encapsulation;

public class Main {

	public static void main(String[] args) {
		Car car = new Car();

		car.setModel("Toyota");
		car.setColor("red");
		car.setYear(0);
		
		car.start();
		
		System.out.println("color : " + car.getColor());
		System.out.println("year : " + car.getYear());
	}
}
