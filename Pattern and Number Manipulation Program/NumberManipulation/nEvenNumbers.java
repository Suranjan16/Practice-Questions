
import java.util.Scanner;

public class nEvenNumbers {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how much even numbers you want to print: ");
        int  num = sc.nextInt();
        int i = 1;
        while (i <= num) {
            System.out.println(2 * i);
            i++;
        }
    }
}
