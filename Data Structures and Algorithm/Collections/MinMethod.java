import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MinMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] a = sc.nextLine().trim().split("\\s+");
        ArrayList<String> list = new ArrayList<>();
        for(String a1: a) {
            list.add(a1);
        }
        String minValue = Collections.min(list);
        System.out.println(minValue);
    }
}
