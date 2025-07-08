
import java.util.Scanner;

public class SummingOfIntegerDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        sumOfDigits(a);
    }

    public static void sumOfDigits(int x) {
       int N = x;
       int sum = 0;

       while(x > 0) {
         sum += x % 10;
         x /= 10;  
       }
       System.out.println("Sum of digits of the number " + N + " is: " + sum);
    }
}
