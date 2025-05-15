
import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Digit d = new Digit();
        Scanner a = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = a.nextInt();
        d.count(num);
    }
}

class Digit {
    void count(int a) {
        int digit = 0;
        while(a > 0) {
            a /= 10;
            digit++;
        }
        System.out.println("Digit count: " + digit);
    }
}
