
import java.util.Scanner;

public class SmallestDigitOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        int small = smallestDigit(a);
        System.out.println("Smallest digit of the number " + a + " is: " + small);
    }

    public static int smallestDigit(int x) {
        int smallest = 9;
        while (x > 0) {
            int digit = x % 10;
            x /= 10;

            if(digit < smallest) {
                smallest = digit;
            }
        }
        return smallest;
    }
}
