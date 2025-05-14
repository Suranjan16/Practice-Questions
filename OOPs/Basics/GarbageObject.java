class Laptop {
    String brand; 
    String color;

    public void notification() {
        System.out.println("Notification sent!");
    }
}

public class GarbageObject {

    public static void main(String[] args) {
        new Laptop().notification();
    }
}