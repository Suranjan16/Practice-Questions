// package Advance Java.Exception Handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MutlipleCatchBlock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
            }

            int index = sc.nextInt();
            int x = a[index];
            System.out.println(x);
        }
        catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println("Array index out of bound");
        }
        catch (InputMismatchException a) {
            System.out.println("Enter valid input");
        }  
        catch (Exception e) {
            System.out.println("Invalid input");
        }
        finally {
            System.out.println("Program executed");
        }
    }
}
