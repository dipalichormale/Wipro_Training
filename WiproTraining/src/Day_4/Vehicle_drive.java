package Day_4;

abstract class Vehicle_drive {
	abstract void speed();
	abstract void brand();
}

class Car extends Vehicle_drive {
	void speed() {
		System.out.println("speed of the car: 4 km/hr");
	}
	
	void brand() {
		System.out.println("brand is: range rover");
	}
}

class Bike extends Vehicle_drive {
	void speed() {
		System.out.println("speed of the car: 4 km/hr");
	}
	
	void brand() {
		System.out.println("brand is: shine ");
	}
}
