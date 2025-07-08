
import java.util.Scanner;

public class NthTermOfTheSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int nthTerm = (a * (a + 1)) / 2;

        System.out.println(a + "th term of the series is: " + nthTerm);
    }
}
