//Vehicle, Car, Electric Car
class Vehicle {
    String brand;
    int year;

    Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    void start() {
        System.out.println("Vehicle started");
    }
}

class Car extends Vehicle {
    int doors;

    Car(String brand, int year, int doors) {
        super(brand, year);
        this.doors = doors;
    }

    void drive() {
        System.out.println("Car is driving");
    }
}

class ElectricCar extends Car {
    int battery;

    ElectricCar(String brand, int year, int doors, int battery) {
        super(brand, year, doors);
        this.battery = battery;
    }

    void charge() {
        System.out.println("Charging battery: " + battery + " kWh");
    }
}

public class Main3 {
    public static void main(String[] args) {
        ElectricCar e = new ElectricCar("Tesla", 2024, 4, 75);

        e.start();
        e.drive();
        e.charge();
    }
}