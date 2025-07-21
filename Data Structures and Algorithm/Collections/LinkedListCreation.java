import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListCreation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList<>();
        
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            String str = sc.next();
            list.addLast(str);
        }

        System.out.println("Linked List: " + list);
    }
}
