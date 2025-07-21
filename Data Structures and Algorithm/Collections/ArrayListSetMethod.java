import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListSetMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many element you want to add in th arrayList: ");
        int n = sc.nextInt();
        
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        System.out.println("ArrayList: " + list);

        // Using set method with index and element. This method replace the particular index element with the new one
        System.out.println("Enter the index number which you want to replace: ");
        int index = sc.nextInt();
        System.out.println("Enter the element by which you want the replace: ");
        int element = sc.nextInt();

        list.set(index, element);
        System.out.println("Updated ArrayList: " + list);
    }
}
