import java.util.Arrays;
import java.util.Scanner;

public class FindMinElemFromArray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of the Array: ");
            int size = sc.nextInt();
            
            int[]arr = new int[size];
            System.out.println("Enter the array elements: ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            
            int min_value = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (min_value > arr[i]) {
                    min_value = arr[i];
                }
            }
            System.out.println("Array: " + Arrays.toString(arr));
            System.out.println("Minimum value of the array is: " + min_value);
        }
    }
}
