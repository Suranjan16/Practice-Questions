
import java.util.Arrays;
import java.util.Scanner;

public class AvgOfArray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int size = sc.nextInt();
            int[]a = new int[size];
            for(int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
            }
            double sum = 0;
            for (int i = 0; i < a.length; i++) {
                sum += a[i];
            }
            System.out.println("Arrays: " + Arrays.toString(a));
            System.out.println("Sum of the array is: " + sum);
            System.out.println("Average of the array is: " + (sum/size));
        }
    }
}
