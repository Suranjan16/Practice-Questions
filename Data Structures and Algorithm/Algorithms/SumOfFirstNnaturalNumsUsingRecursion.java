
import java.util.Scanner;


public class SumOfFirstNnaturalNumsUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        int res = sum(a);
        System.out.println("Sum of first " + a + " natural number is: " + res);
    }
    public static int sum(int x) {
        if(x == 1) return 1;
        else return x + sum(x - 1);
    }
}
