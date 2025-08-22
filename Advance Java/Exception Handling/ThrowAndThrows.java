import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowAndThrows {
    public static void main(String[] args) {
        bank();
    }

    public static void bank() {
       try {
        atm();
       }
       catch (Exception ex) {
        System.out.println("Banking ended");
       }
       System.out.println("Banking ended");
    }

    public static void atm() throws InputMismatchException{
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int a = sc.nextInt();
            System.out.println(a);
        }
        catch (InputMismatchException ex) {
            System.out.println("Exception handled");
            throw ex;
        }
        finally {
            System.out.println("atm ended");
        }
    }
}