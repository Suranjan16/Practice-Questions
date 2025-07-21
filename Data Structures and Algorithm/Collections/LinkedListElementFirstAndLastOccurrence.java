import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListElementFirstAndLastOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many elements you want to add to linked list: ");
        int n = sc.nextInt();
        
        LinkedList<Integer> list = new LinkedList<>();
        for(int i = 1; i <= n; i++) {
            list.add(sc.nextInt());
        }

        System.out.println("Enter the target element which first and last occurrence you want to know: ");
        int a = sc.nextInt();

        int first = -1;
        int last = -1;
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).equals(a)) {
                if(first == -1) {
                    first = i;
                }
              last = i;
            }
        }
     
        if(first == -1) {
            System.out.println("Target element not found");
        } else {
            System.out.println("First occurrence: " + first);
            System.out.println("Last occurrence: " + last);
        }

    }
}
