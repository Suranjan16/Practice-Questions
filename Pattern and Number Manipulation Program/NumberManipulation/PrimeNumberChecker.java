
import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (isPrime(a) == true) {
            System.out.println("It is a prime number.");
        } else {
            System.out.println("It is not a prime number.");
        }

    }

    public static boolean isPrime(int x) {
        boolean res = true;
        for (int i = 2; i <= x / 2; i++) {
            if (x % i == 0) {
                res = false;
            }
        }
        return res;
    }
}
