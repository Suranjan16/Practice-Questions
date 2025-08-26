import java.util.Scanner;

public class NestedTryCatchBlock {

    public static void main(String[] args) {
        final int pin = 123;
        int enteredPin = 0;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your pin: ");
            enteredPin = sc.nextInt();
            if (pin == enteredPin) {
                System.out.println("Success");
            } else {
                try {
                    System.out.println("Only two more attempts left");
                    System.out.println("Enter your pin: ");
                    enteredPin = sc.nextInt();
                    if (pin == enteredPin) {
                        System.out.println("Success");
                    } else {
                        try {
                            System.out.println("Only one more attempts left");
                            System.out.println("Enter your pin: ");
                            enteredPin = sc.nextInt();
                            if (pin == enteredPin) {
                                System.out.println("Success");
                            } else {
                                System.out.println("Warning: you can't use atm for 24 hours.");
                                throw new WrongPinException("Wrong pin!");
                            }
                        } catch (Exception e) {
                            System.out.println("Exception Handled!");
                        }
                    }
                } catch (Exception e) {
                    System.out.println("Exception Handled!");
                }
            }
        } catch (Exception e) {
            System.out.println("Exception Handled!");
        }
    }
}

class WrongPinException extends Exception {
    public WrongPinException(String msg) {
        super(msg);
    }
}