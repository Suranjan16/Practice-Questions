
import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number you would like to reverse: ");
        int a = sc.nextInt();
        System.out.println("Reverse of the number " + a + " is: " + revNumber(a));
    }

    public static int revNumber(int x) {
        int rev = 0;
        int sign = 1;
        if (x < 0)  {
          sign = -1;
          x = -x;
        }
        while(x > 0) {
           rev = (rev * 10) + (x % 10);
           x /= 10;
        }
        return sign * rev;
    }
}
