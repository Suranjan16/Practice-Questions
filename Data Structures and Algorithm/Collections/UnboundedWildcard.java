import java.util.ArrayList;
import java.util.List;

public class UnboundedWildcard {
    public static void main(String[] args) {

        Apple a1 = new Apple("Green", 250);
        Apple a2 = new Apple("Red", 180);
        Apple a3 = new Apple("Mix", 200);
 
        ArrayList<Apple> list1 = new ArrayList<>();
        list1.add(a1);
        list1.add(a2);
        list1.add(a3);

        Orange o1 = new Orange("Green", 250);
        Orange o2 = new Orange("Red", 180);
        Orange o3 = new Orange("Mix", 200);
        Orange o4 = new Orange("Mix", 210);
 
        ArrayList<Orange> list2 = new ArrayList<>();
        list2.add(o1);
        list2.add(o2);
        list2.add(o3);
        list2.add(o4);

        displayDetails(list1);
        displayDetails(list2);
    }

    public static void displayDetails(List<?> fruitList) {
        System.out.println("Fruit List: " + fruitList);
        System.out.println("Fruit count: " + fruitList.size());
    }
}

class Apple {
    String color; 
    int price;
    public Apple(String color, int price) {
        this.color = color;
        this.price = price;
    }
    @Override
    public String toString() {
        return "Apple [color=" + color + ", price=" + price + "]";
    }
}
class Orange {
    String color; 
    int price;
    public Orange(String color, int price) {
        this.color = color;
        this.price = price;
    }
    @Override
    public String toString() {
        return "Orange [color=" + color + ", price=" + price + "]";
    }
}
