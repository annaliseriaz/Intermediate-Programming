package main;

class Car {
	//Fields
	String color;
	int year;
	
	//Constructor
	Car(String color, int year) {
		this.color = color;
		this.year = year;
	}
	
	//Method
	void displayInfo() {
		System.out.println("Car color: " + color + ", Year: " + year);
	}
}

public class MainnCarrrr {
	public static void main(String[] args) {
		//Creating an object
		Car mynewCar = new Car("Red", 2020);
		mynewCar.displayInfo();
	}
} 
