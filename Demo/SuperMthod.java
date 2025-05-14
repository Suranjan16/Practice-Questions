

public class SuperMthod {
    public static void main(String[] args) {
        
        Car c = new Car("Volvo", "Y3", 2025, 5);
        c.access();
    }
}

class Vehicle {
    String company;
    String model;
    int year;

    public Vehicle(String company, String model, int year) {
        this.company = company;
        this.model = model;
        this.year = year;
    }

    public void displayDetails() {
        System.out.println("Parent details.");
        
    }
}

class Car extends Vehicle {
    int seatingCapacity;

    public Car(String company, String model, int year, int seatingCapacity) {
        super(company, model, year);
        this.seatingCapacity = seatingCapacity;
    }
    @Override
    public void displayDetails() {
        System.out.println("Manufacturing company: " + company);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Seating capacity: " + seatingCapacity);
    }
    public void access() {
        super.displayDetails();
        displayDetails();
    }
}
