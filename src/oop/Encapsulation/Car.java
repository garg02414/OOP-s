package oop.Encapsulation;

public class Car {

	private String model;
	private String color;
	private int year;

	public void setModel(String model) {
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setYear(int year) {
        if (year > 0) {
            this.year = year;
        } else {
            throw new IllegalArgumentException("Year must be greater than 0");
        }
    }

	public int getYear() {
		return year;
	}
	
	public void start() {
		System.out.println("Car Started inside Encapsulation");
	}
	
}
