import java.util.Scanner;
import java.util.Arrays;

public class ReversedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[]arr = new int[size];
        System.out.println("Enter the elements: ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[]arr1 = new int[size];
        for(int i = 0; i < arr1.length; i++) {
           arr1[i] = arr[arr.length - 1 - i];
        }
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Reversed Array: " + Arrays.toString(arr1));
        
        sc.close();
    }
    
}
