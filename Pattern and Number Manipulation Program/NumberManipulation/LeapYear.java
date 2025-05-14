
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int number = sc.nextInt();
            
            if (number % 4 == 0) {
                if (number % 100 == 0) {
                    if (number % 400 == 0) {
                        System.out.println("The year " + number + " is a leap year.");
                    } else {
                        System.out.println("The year " + number + " is not a leap year.");
                    }
                } else {
                    System.out.println("The year " + number + " is a leap year.");
                }
            } else {
                System.out.println("The year " + number + " is not a leap year.");
            }
        }
    }
}
