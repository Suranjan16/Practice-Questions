import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class UseOfIterator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // String[] a = sc.nextLine().trim().split("\\s+");
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        System.out.print("ArrayList: ");

        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();
        System.out.println("ArrayList: " + list);
       sc.close();
    }
}
