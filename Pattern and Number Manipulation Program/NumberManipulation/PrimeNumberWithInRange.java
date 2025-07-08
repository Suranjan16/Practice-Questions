
import java.util.Scanner;

public class PrimeNumberWithInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter last number: ");
        int b = sc.nextInt();

        prime(a, b);
    }

    public static void prime(int x, int y) {
        System.out.println("Prime numbers in range of " + x + " to " + y + " are: ");
        for (int i = x; i <= y; i++) {
            boolean isPrime = true;
            for(int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                }
            }
            if(isPrime == true) {
                System.out.println(i);
            }
        }
    }
}
