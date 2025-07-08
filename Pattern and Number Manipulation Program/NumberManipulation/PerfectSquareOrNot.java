
import java.util.Scanner;

public class PerfectSquareOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number to check whether it is a perfect square:");
        int x = sc.nextInt();
        if (isPerfect(x) ==  true) {
            System.out.println("Your entered number is a perfect square.");
        } else {
            System.out.println("Your entered number is not a perfect square.");
        }
    }
    public static boolean isPerfect(int a) {
        boolean square = false;
        for (int i = 1; i <= a / 2; i++) {
            if (i * i == a) {
                square = true;
            }
        }
        return square;
    }
}
