
import java.util.Scanner;

public class NumberTesterWithLambda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is even or not: ");
        int num = sc.nextInt();
        NumberTester isEven = (n) -> (n % 2 == 0);
        System.out.println("The number " + num + " is even? " + isEven.test(num));
    }
}

interface NumberTester {
    boolean test(int a);
}
