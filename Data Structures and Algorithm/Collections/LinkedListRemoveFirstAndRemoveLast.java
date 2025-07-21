import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListRemoveFirstAndRemoveLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList<>();
        int a = sc.nextInt();
        for(int i = 1; i <= a; i++) {
            list.add(sc.next());
        }
        System.out.println("Linked List: " + list);
        list.removeFirst();
        list.removeLast();
        System.out.println("Updated Linked List: " + list);
    }
}
