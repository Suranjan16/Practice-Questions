import java.util.Scanner;

public class FactorialOfNUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int factorial = fact(x);
        System.out.println("Factorial of " + x + " is: " + factorial);
    }   
    public static int fact(int a) {
        if(a == 1) return 1;
        else return a * fact(a - 1); 
    } 
}
