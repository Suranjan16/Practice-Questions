import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        char[]arr = a.toCharArray();
        String b = "";
        for(int i = arr.length - 1; i >= 0; i--) {
            b = b + arr[i];
        }
        System.out.println("Reversed String: " + b);
        sc.close();
    }
}
