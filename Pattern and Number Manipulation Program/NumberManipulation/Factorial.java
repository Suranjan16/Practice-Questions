// public package NumberManipulation;

import java.util.Scanner;

public class Factorial {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int n = num;
        int factorial = 1; 

        while (num > 0) {
            factorial *= num % 10;
            num--;
        }
        System.out.println("Factorial of " + n + " is = " + factorial);
        sc.close();
     }
    
}