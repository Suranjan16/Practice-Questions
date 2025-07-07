
import java.util.Scanner;

public class FibonacciSeriesUptoN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        fibo(x);
    }

    public static void fibo(int max) {
        int a = 0;
        int b = 1;
        System.out.print("Fibonacci series upto " + max + " is: ");
        while(max >= a) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        } 
    }
}
