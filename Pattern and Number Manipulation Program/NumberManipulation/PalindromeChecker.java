
import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number you want to check whether it is a palindrome or not? ");
        int a = sc.nextInt();
        int b = isPalindrome(a);
        if (a == b) {
            System.out.println("The number " + a + " is a palindrome.");
        } else {
            System.out.println("The number " + a + " is not a palindrome.");
        }
    }

    public static int isPalindrome(int x) {
        int rev = 0;
        while(x > 0) {
           rev = (rev * 10) + (x % 10);
           x /= 10;
        }
        return rev;
    }
}
