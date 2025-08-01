import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DisJointMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] a1 = sc.nextLine().trim().split("\\s+");
        String[] a2 = sc.nextLine().trim().split("\\s+");
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i = 0; i < a1.length; i++) {
            list1.add(Integer.parseInt(a1[i]));
        }
        for(int i = 0; i < a2.length; i++) {
            list2.add(Integer.parseInt(a2[i]));
        }

        boolean isTrue = Collections.disjoint(list1, list2);
        System.out.println(isTrue);
    }
}
