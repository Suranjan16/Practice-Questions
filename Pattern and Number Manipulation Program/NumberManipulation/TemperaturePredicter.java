
import java.util.Scanner;

public class TemperaturePredicter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double b = sc.nextDouble();
        broadcast(b);
    }

    static void broadcast(double a) {
        if (a < 0) {
            System.out.println("The temperature " + a + " is categorise as freezing.");
        } else if (a <= 15 && a >= 0) {
            System.out.println("The temperature " + a + " is categorise as cold.");
        } else if (a >= 16 && a <= 25) {
            System.out.println("The temperature " + a + " is categorise as moderate.");
        } else if (a >= 25 && a <= 35) {
            System.out.println("The temperature " + a + " is categorise as warm.");
        } else if (a > 35) {
            System.out.println("The temperature " + a + " is categorise as Hot.");
        } else {
            System.out.println("Enter a valid temperature.");
        }
    }
}
