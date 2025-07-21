import java.util.ArrayList;
import java.util.List;

public class UpperBoundedWildcard {
    public static void main(String[] args) {
       
        Fruit a1 = new Apple(180, "red");
        Fruit a2 = new Apple(200, "green");
        Fruit a3 = new Apple(220, "mix");

        ArrayList appleList = new ArrayList<>();
        appleList.add(a1);
        appleList.add(a2);
        appleList.add(a3);

        Fruit o1 = new Orange(180, "red");
        Fruit o2 = new Orange(200, "green");
        Fruit o3 = new Orange(220, "mix");
        Fruit o4 = new Orange(210, "xyz");

        ArrayList orangeList = new ArrayList<>();
        orangeList.add(o1);
        orangeList.add(o2);
        orangeList.add(o3);
        orangeList.add(o4);

        display(orangeList);
        display(appleList);
    }

    public static void display(List<? extends Fruit> list) {
        System.out.println("Fruit List: " + list);
        System.out.println("Fruit Count: " + list.size());
    }
}

class Fruit {

}

class Apple extends Fruit {
    int price;
    String color;

    public Apple(int price, String color) {
        this.price = price;
        this.color = color;
    }
    @Override
    public String toString() {
        return "Apple [price=" + price + ", color=" + color + "]";
    }
}

class Orange extends Fruit {
    int price;
    String color;
    public Orange(int price, String color) {
        this.price = price;
        this.color = color;
    }
    @Override
    public String toString() {
        return "Orange [price=" + price + ", color=" + color + "]";
    }
}