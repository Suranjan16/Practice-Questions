import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class ArrayDequeImplementation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Deque<Integer> ad = new ArrayDeque<>();
        for(int i = 1; i <= n; i++) {
            ad.addLast(sc.nextInt());
        }
        
        System.out.println("ArrayDeque: " + ad);
        ad.addFirst(sc.nextInt());
        ad.addLast(sc.nextInt());

        ad.removeFirst();
        ad.removeFirst();

        System.out.println("Updated  ArrayDeque: " + ad);
    }
}
