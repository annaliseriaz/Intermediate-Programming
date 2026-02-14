package midEx;

public class CarUpgrade {

	public static void main(String[] args) {
		Car car = new Car();
		car.owner("John Doe", 2021);
		
		double remainingAmount = car.upgradeAccessories(25000);
		System.out.println("Upgraded Car: ");
		car.printCar();
		System.out.println("Remaining Amount: " + remainingAmount);
		
		car = new Car();
		car.owner("Jane Smith", 2019);
		
		remainingAmount = car.upgradeAccessories(40000);
		System.out.println("Upgraded Car: ");
		car.printCar();
		System.out.println("Remaining Amount : " + remainingAmount);
		
		car = new Car();
		car.owner("Mark Johnson", 2022);
		
		remainingAmount = car.upgradeAccessories(50500);
		System.out.println("Upgraded Car: ");
		car.printCar();
		System.out.println("Remaining Amount : " + remainingAmount);
		
		car = new Car();
		car.owner("Jane Doe", 2020);
		car.printCar();
	}
}
