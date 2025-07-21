import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListGetAtIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        LinkedList list = new LinkedList();
        for(int i = 1; i <= a; i++) {
            list.addLast(sc.next());
        }
        System.out.println("LinkedList: " + list);
        int idx = sc.nextInt();
        System.out.println("Element present at index " + idx + ": " + list.get(idx));
    }
}
