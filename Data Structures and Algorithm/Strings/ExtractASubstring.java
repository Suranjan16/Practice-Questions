
import java.util.Scanner;

public class ExtractASubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        int start = sc.nextInt();
        int end = sc.nextInt();

        String b = a.substring(start, end);
        System.out.println(b);
        sc.close();
    }
}
