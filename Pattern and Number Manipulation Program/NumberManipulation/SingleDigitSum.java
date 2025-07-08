
import java.util.Scanner;

public class SingleDigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = a;

        while(a >= 10) {
            int sum = 0;
            while(a > 0) {
                sum += (a % 10);
                a /= 10;
            }
            a = sum;
        }
        System.out.println("The single digit sum of digit of " + b + " is " + a);
    }
}
