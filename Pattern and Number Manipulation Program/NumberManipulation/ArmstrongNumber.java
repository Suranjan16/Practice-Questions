
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        Number n = new Number();
        n.calculate(num);
    }
}

class Number {
    void calculate(int a) {
    
        int digits = 0;
        while(a != 0) {
             a = a/10;
             digits++;
        }
        int sum = 0;
        while(a != 0) {
            int digit = a % 10;
            sum += Math.pow(digit, digits);
        }
        if(sum == a) {
            System.out.println("It is an armstrong number.");
        } else {
            System.out.println("It is not an armstrong number.");
        }
    }
}
