
import java.util.Scanner;

public class GcdCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = a;
        int y = b;

        while (b != 0) {
            int gcd = b;
            b = a % b;
            a = gcd;
        }
        System.out.println("Greatest common divisor of " + x + " and " + y + " is: " + a);
    }
}