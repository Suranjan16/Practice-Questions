public class ConstructorChainning {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        Car c = new Car();
    }
}

class Car {

    public Car() {
        this(10);
        System.out.println("0 Parameter constructor.");
    }
    public Car(int i) {
        this(10,20);
        System.out.println("1 parameter constructor.");
    }
    public Car(int i , int j) {
        System.out.println("2 parameter constructor.");
    }
}
