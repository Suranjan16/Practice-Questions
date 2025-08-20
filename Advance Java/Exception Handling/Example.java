// package Advance Java.Exception Handling;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int res = a / b;
            System.out.println(res);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Exception Handled!");
        }
    }
}
