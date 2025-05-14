
import java.util.Scanner;

public class FinalKeyword {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the radius of the circle: ");
            double radius = sc.nextDouble();
            areaOfCircle e = new areaOfCircle();
            e.area(radius);
        }
    }
}

class areaOfCircle {
    final double pi = 3.14;
    void area(double r){
       System.out.println("Area of the circle is: " + (pi * r * r));
    }
}
