
import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = f2c(a);
        System.out.print(a);
        System.out.printf(" fahrenheit to celcius is: %.2f" , b);
    }

    public static double f2c(double x) {
        double celcius = ((x - 32) * 5 )/ 9;
        return celcius;
    }
}