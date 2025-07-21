import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListGetFirstAndLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        int a = sc.nextInt();
        for(int i = 1; i <= a; i++) {
            list.addLast(sc.nextInt());
        }
        System.out.println("Linked List: " + list);
        System.out.println("First Element: " + list.getFirst());
        System.out.println("Last Element: " + list.getLast());
    }
}
