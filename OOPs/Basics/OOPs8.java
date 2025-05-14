public class OOPs8 {

    public static void main(String[] args) {
        Laptop l = new Laptop();
        l.brand = "HP";
        l.price = 35000;
        l.color = "Black";

        System.out.println("Brand = " + l.brand);
        System.out.println("Price = " + l.price);
        System.out.println("Color = " + l.color);

        l.playMovie();
    }
}

class Laptop {
    String brand;
    int price;
    String color;

    public void playMovie() {
        System.out.println("Laptop plays movie.");
    }
} 