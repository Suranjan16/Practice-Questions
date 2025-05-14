import java.util.Scanner;

public class PositiveNegetiveAndZero {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number: ");
            int number = sc.nextInt();
            
            if (number < 0) {
                System.out.println("The number " + number + " is negetive.");
            } else if (number > 0) {
                System.out.println("The number " + number + " is positive.");
            } else {
                System.out.println("The number is zero.");
            }
        }
    }
}
