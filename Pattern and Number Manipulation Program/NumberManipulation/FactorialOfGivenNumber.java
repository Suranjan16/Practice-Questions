
import java.util.Scanner;

public class FactorialOfGivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        System.out.println(fact(a));
    }

    public static int fact(int x) {
        if (x == 0) return 1;
        int factorial = 1;
       for(int i = 1; i <= x; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
}
