// package OOPs.StaticVar And Methods;

import java.util.Scanner;

public class StaticMethodForCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st integer: ");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd integer: ");
        int b = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the operation u want to do: ");
        String s = sc.nextLine();

        switch(s) {
            case "addition": 
                MathOperation.addition(a, b);
              break;
            case "subtraction": MathOperation.subtraction(a, b);
              break;
            case "multiplication": MathOperation.multiplication(a, b);
            break;
            case "division": MathOperation.division(a, b);
            break;
            default: System.out.println("Invalid Input");
            sc.close();
            
        }
}

class MathOperation {
    public static void addition(int a, int b) {
         int sum = a + b;
         System.out.println("Addition = "  + sum);
    }
    public static void subtraction(int a, int b) {
         int sum = a - b;
         System.out.println("Subtraction = "  + sum);
    }
    public static void multiplication(int a, int b) {
         int sum = a * b;
         System.out.println("Multiplication = "  + sum);
    }
    public static void division(int a, int b) {
         int sum = a / b;
         System.out.println("Division = "  + sum);
    }
}
}
