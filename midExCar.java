package midEx;

public class Car {
	String ownerName;
	int yearModel;
	boolean hasAC = false;
	boolean hasLeatherSeats = false;
	boolean hasBackWipers = false;
	boolean hasFogLights = false;
	
	public void owner (String name, int year) {
		ownerName = name;
		yearModel = year;
	}
	
	public double upgradeAccessories (double availableAmount) {
		if (availableAmount >= 21500) {
			hasAC = true;
			availableAmount -= 21500;
		}
		
		if (availableAmount >= 14400) {
			hasLeatherSeats = true;
			availableAmount -= 14400;
		}
		
		if (hasLeatherSeats && availableAmount >= 6250) {
			hasBackWipers = true;
			availableAmount -= 6250;
		}
		
		if (hasBackWipers && availableAmount >= 3300) {
			hasFogLights = true;
			availableAmount -= 3300;
		}
		
		return availableAmount;
	}
	
	public void printCar() {
		System.out.println("Owner: " + ownerName);
		System.out.println("Year Model: " + yearModel);
		System.out.println("AC: " + (hasAC ? "Installed" : "Not Installed"));
		System.out.println("Leather Seats: " + (hasLeatherSeats ? "Installed" : "Not Installed"));
		System.out.println("Back Wipers: " + (hasBackWipers ? "Installed" : "Not Installed"));
		System.out.println("Fog Lights: " + (hasFogLights ? "Installed" : "Not Installed"));
	}
}
