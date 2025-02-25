package oop;

import oop.objectAndClass.Car;

public class Main {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		myCar.color= "red";
		myCar.model = "Toyota";
		myCar.year = 22;
		
		myCar.start();
		myCar.stop();
				
	}
}
