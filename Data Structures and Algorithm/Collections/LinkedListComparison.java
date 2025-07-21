import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        LinkedList<Integer> list1 = new LinkedList<>();
        for(int i = 1; i <= n1; i++) {
            int num = sc.nextInt();
            list1.addLast(num);
        }
        int n2 = sc.nextInt();
        LinkedList<Integer> list2 = new LinkedList<>();
        for(int i = 1; i <= n2; i++) {
            int num = sc.nextInt();
            list2.addLast(num);
        }
        
        if(list1.equals(list2)) {
            System.out.println("Two lists are identical.");
        } else {
            System.out.println("Two lists are not identical.");
        }

    }
}
