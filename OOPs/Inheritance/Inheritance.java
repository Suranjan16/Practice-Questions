

public class Inheritance {
    public static void main(String[] args) {
        Car myCar = new Car(); 
        System.out.println("Type of car: " + myCar.carType);
        myCar.startEngine();
        myCar.openTrunk();
        System.out.println("My car has " + myCar.wheels + " Wheels.");

    }
}

class Vehicle {
    int wheels = 4;
    public void startEngine() {
        System.out.println("Engine is starting");
    }
}

class Car extends Vehicle {
    String carType = "Sedan";
    public void openTrunk() {
        System.out.println("Trunk is open.");
    }
}
