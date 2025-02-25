package oop.inheritance;

public class Main {

	public static void main(String[] args) {
		
		 ElectricCar car = new ElectricCar();
		 
		 car.color = "red";
		 car.model = "Toyota";
		 car.year = 20;
		 
		 car.start();
		 car.chargeCar();
		 car.stop();
		 
		 
	}
}
