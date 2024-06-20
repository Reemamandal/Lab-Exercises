package day17_20th_june;

interface Vehicle {
    void start();
    void stop();
}

interface LandVehicle extends Vehicle {
    void drive();
}

interface SeaVehicle extends Vehicle {
	void floating();
}

class Car implements LandVehicle {
    @Override
    public void start() {
        System.out.println("Car is starting.");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping.");
    }

    @Override
    public void drive() {
        System.out.println("Car is driving.");
    }
}

class Bicycle implements LandVehicle {
    @Override
    public void start() {
        System.out.println("Bicycle is starting.");
    }

    @Override
    public void stop() {
        System.out.println("Bicycle is stopping.");
    }

    @Override
    public void drive() {
        System.out.println("Bicycle is driving.");
    }
}

class Ship implements SeaVehicle {
    @Override
    public void start() {
        System.out.println("Ship is starting.");
    }

    @Override
    public void stop() {
        System.out.println("Ship is stopping.");
    }

    @Override
    public void floating() {
        System.out.println("Ship is floating.");
    }
}

class Submarine implements SeaVehicle {
    @Override
    public void start() {
        System.out.println("Submarine is starting.");
    }

    @Override
    public void stop() {
        System.out.println("Submarine is stopping.");
    }

    @Override
    public void floating() {
        System.out.println("Submarine is floating.");
    }
}

public class Main1 {
	public static void main(String[] args) {
        // Create instances of each class
        LandVehicle car = new Car();
        LandVehicle bicycle = new Bicycle();
        SeaVehicle ship = new Ship();
        SeaVehicle submarine = new Submarine();

        // Test Car methods
        System.out.println("Testing Car:");
        car.start();
        car.drive();
        car.stop();

        // Test Bicycle methods
        System.out.println("\nTesting Bicycle:");
        bicycle.start();
        bicycle.drive();
        bicycle.stop();

        // Test Ship methods
        System.out.println("\nTesting Ship:");
        ship.start();
        ship.floating();
        ship.stop();

        // Test Submarine methods
        System.out.println("\nTesting Submarine:");
        submarine.start();
        submarine.floating();
        submarine.stop();
    }

}
