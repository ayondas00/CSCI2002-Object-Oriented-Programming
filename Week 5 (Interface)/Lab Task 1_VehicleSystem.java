package JavaProject;

interface Vehicle {
    void start();
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car starts with key.");
    }
}

class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bike starts with button.");
    }
}

class Bus implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bus starts with ignition system.");
    }
}

public class VehicleSystem {
    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();
        Bus bus = new Bus();
        car.start();
        bike.start();
        bus.start();
    }
}
