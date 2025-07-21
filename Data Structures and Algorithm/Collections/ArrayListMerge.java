import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMerge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how much elements do want in your first ArrayList: ");
        int a = sc.nextInt();
        System.out.println("Enter arraylist elements one by one: ");
        ArrayList list1 = new ArrayList<>();
        for(int i = 1; i <= a; i++) {
            list1.add(sc.next());
        }
        System.out.println("First arrayList: "  + list1);
        System.out.println("Enter how much elements do want in your second ArrayList: ");
        int b = sc.nextInt();
        System.out.println("Enter arraylist elements one by one: ");
        ArrayList list2 = new ArrayList<>();
        for(int i = 1; i <= b; i++) {
            list2.add(sc.next());
        }
        System.out.println("Second arrayList: "  + list2);

        ArrayList list3 = new ArrayList<>();
        list3.addAll(list1);
        list3.addAll(list2);

        System.out.println("Merged ArrayList: " + list3);
        sc.close();
    }
}
