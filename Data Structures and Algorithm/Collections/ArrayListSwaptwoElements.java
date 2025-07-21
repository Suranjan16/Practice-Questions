import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListSwaptwoElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how much elements you want to store: ");
        int a = sc.nextInt();
        ArrayList list = new ArrayList<>();
        System.out.println("Enter elements one by one: ");
        for(int i = 1; i <= a; i++) {
            list.add(sc.next());
        }
        System.out.println("ArrayList: " + list);
        System.out.println("Enter the first element index which u want to swap: ");
        int x = sc.nextInt();
        System.out.println("Enter the second element index which u want to swap: ");
        int y = sc.nextInt();

        Object temp = list.get(x);
        list.set(0, list.get(y));
        list.set(y, temp);

        System.out.println("ArrayList after swap operation: " + list);
        sc.close();
    }
}
