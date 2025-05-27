
import java.util.Scanner;

public class CheckIfAStringIsPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();

        StringBuilder sb = new StringBuilder(a);

        String b = sb.reverse().toString();

        if(a.equals(b)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
