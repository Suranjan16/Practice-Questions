import java.util.Scanner;

public class NthFibonacciNmber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(fibonacci(a));
    }

    public static int fibonacci(int a) {
        int x = 0;
        int y = 1;
        for (int i = 1; i <= a; i++) {
           int temp = x + y;
           x = y;
           y = temp;
        }
        return x;
    }
}
