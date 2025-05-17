
import java.util.Arrays;
import java.util.Scanner;

public class ReversingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int a = sc.nextInt();
        int[]arr = new int[a];
        System.out.println("Enter the array elements: ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
         int arr1[] = new int[a];
        for(int i = 0; i < arr1.length; i++) {
            arr1[i] = arr[arr1.length - 1 - i];
        }
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Reversed Array: " + Arrays.toString(arr1));
    }
}
