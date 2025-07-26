package Day_5;

interface Drivable {
    void startEngine();
    void drive();
}

interface Flyable {
    void startEngine();
    void fly();
}

interface Swimmable {
    void startEngine();
    void swim();
}

class AmphibiousVehicle implements Drivable, Flyable, Swimmable {
    @Override
    public void startEngine() {
        System.out.println("Amphibious Vehicle engine started.");
    }

    @Override
    public void drive() {
        System.out.println("Amphibious Vehicle is driving.");
    }

    @Override
    public void fly() {
        System.out.println("Amphibious Vehicle is flying.");
    }

    @Override
    public void swim() {
        System.out.println("Amphibious Vehicle is swimming.");
    }
}

public class VehicleSimulator {
    public static void main(String[] args) {
        AmphibiousVehicle myVehicle = new AmphibiousVehicle();
        myVehicle.startEngine(); // Calls the common method
        myVehicle.drive();
        myVehicle.fly();
        myVehicle.swim();
    }
}