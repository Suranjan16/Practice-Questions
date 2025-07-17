import java.util.ArrayList;

public class ArrayListAddMethod {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList<>();

        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);

        System.out.println("ArrayList: " + arr);

        arr.add(2, 60);
         
        System.out.println("Updated ArrayList: " + arr);
    }
}
