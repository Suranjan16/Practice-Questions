
import java.util.Scanner;

public class ReverseAStringManually {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        char[]arr = a.toCharArray();
        String a1 = "";
        for(int i = arr.length - 1; i >= 0; i--) {
            a1 += arr[i];
        }
        System.out.println(a1);
        sc.close();
    }
}
