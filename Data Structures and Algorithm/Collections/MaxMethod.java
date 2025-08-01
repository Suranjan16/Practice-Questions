import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MaxMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] a = sc.nextLine().trim().split("\\s+");
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < a.length; i++) {
            list.add(Integer.parseInt(a[i]));
        }

        int value = Collections.max(list);
        System.out.println(value);
    }
}
