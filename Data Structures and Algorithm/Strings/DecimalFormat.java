
import java.util.Scanner;

public class DecimalFormat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num = sc.nextFloat();
        System.out.println(String.format("My number upto 2 decimal point is: %.2f", num));
    }
}
