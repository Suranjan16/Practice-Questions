import java.util.Scanner;
import java.util.Arrays;


public class SumOfArrayElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int size = sc.nextInt();
        int[]arr = new int[size];
        System.out.println("Enter array elements: ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Sum of the array elements = " + sum);
       
        sc.close();
    }
}