import java.util.ArrayList;

public class ArrayListElementUsingEnhancedForLoop {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        for(Object a: list) {
            System.out.println(a);
        }
    }
}
