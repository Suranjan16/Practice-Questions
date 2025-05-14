import java.util.Arrays;
import java.util.Scanner;

public class ArrayAvarage {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of the array: ");
            int size = sc.nextInt();
            
            System.out.println("Enter the array element: ");
            int[]arr = new int[size];
            for(int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            
            int sum = 0;
            
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
            
            double arrayAvarage = sum / size;
            System.out.println("Array; " + Arrays.toString(arr));
            System.out.println("Avarage of the array is: " + arrayAvarage);
        }
    }
}
