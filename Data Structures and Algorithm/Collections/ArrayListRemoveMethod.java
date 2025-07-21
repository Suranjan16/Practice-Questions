import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListRemoveMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);

        System.out.println("ArrayList: " + arr);
        System.out.println("Enter a index which value you want to remove: ");
        int index = sc.nextInt();

        arr.remove(index);
        System.out.println("Updated ArrayList: "  + arr);
    }
}
