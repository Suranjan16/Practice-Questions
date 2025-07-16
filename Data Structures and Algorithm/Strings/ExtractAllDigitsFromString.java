
import java.util.Scanner;

public class ExtractAllDigitsFromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        a = a.replaceAll("\\D", "");
        System.out.println("Extracted Digits: " + a);
        sc.close();
    }
}
