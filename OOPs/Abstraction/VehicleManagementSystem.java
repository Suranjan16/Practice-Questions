public class VehicleManagementSystem {
    public static void main(String[] args) {
        Car c = new Car("BMW","M3",2025,5);
        c.displayDetails();
        Truck t1 = new Truck("Volvo","M7",2024,10100000);
        t1.displayDetails();
    }
}

class Vehicle {
    String make;
    String model;
    int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
}

class Car extends Vehicle {
    int seatingCapacity;

    public Car(String make, String model, int year, int seatingCapacity) {
        super(make, model, year);
        this.seatingCapacity = seatingCapacity;
    }

    public void displayDetails() {
        System.out.println("Car Make: " + this.make);
        System.out.println("Car Model: " + this.model);
        System.out.println("Manufacturing Year: " + this.year);
        System.out.println("Seating Capacity: " + this.seatingCapacity);
        
    }
}
class Truck extends Vehicle {
    int payloadCapacity;

    public Truck(String make, String model, int year, int payloadCapacity) {
        super(make, model, year);
        this.payloadCapacity = payloadCapacity;
    }

    public void displayDetails() {
        System.out.println("Truck Make: " + this.make);
        System.out.println("Truck Model: " + this.model);
        System.out.println("Manufacturing Year: " + this.year);
        System.out.println("Payload Capacity: " + this.payloadCapacity);
    }
}