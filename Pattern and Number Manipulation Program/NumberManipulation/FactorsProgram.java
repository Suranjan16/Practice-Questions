
import java.util.Scanner;

public class FactorsProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        factors(a);

    }

    public static void factors(int x) {
        System.out.print("The factors of " + x + " are: ");
        for(int i = 1; i <= x; i++) {
            if(x % i == 0) {
                System.out.print(i + ", ");
            }
        }
    }
}
