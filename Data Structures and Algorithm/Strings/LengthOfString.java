// package Data Structures and Algorithm.Strings;

import java.util.Scanner;

public class LengthOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String name = sc.nextLine();
        System.out.println("The length of " + name + " is: " + name.length());
        sc.close();
    }
}
