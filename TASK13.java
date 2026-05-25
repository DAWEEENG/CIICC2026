class Vehicle {

    String make;
    String model;
    int year;
}

// Derived Class
class Car extends Vehicle {

    int numberOfDoors;

    void displayDetails() {

        System.out.println("Car Details:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

// Main Class
public class TASK13 {

    public static void main(String[] args) {

        Car car = new Car();

        car.make = "Toyota";
        car.model = "Camry";
        car.year = 2022;
        car.numberOfDoors = 4;

        car.displayDetails();
    }
}