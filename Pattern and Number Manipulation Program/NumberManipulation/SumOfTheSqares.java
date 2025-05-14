
import java.util.Scanner;

public class SumOfTheSqares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        System.out.println("Sum of square upto nth number is: " + sum(a));
    }

    public static int sum(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += (i * i);
        }
        return sum;
    }
}
