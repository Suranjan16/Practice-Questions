import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListAddFirstAndAddLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList<>();
        int a = sc.nextInt();

        for(int i = 1; i <= a; i++) {
            int x = sc.nextInt();
            list.addLast(x);
        }
        System.out.println("Linked List: " + list);

        list.addFirst(sc.nextInt());
        list.addLast(sc.nextInt());

        System.out.println("Updated Linked List: " + list);
    }
}
