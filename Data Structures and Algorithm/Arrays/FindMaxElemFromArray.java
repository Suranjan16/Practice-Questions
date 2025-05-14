import java.util.Arrays;
import java.util.Scanner;

public class FindMaxElemFromArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the Array: ");
        int size = sc.nextInt();
       
        int[]arr = new int[size];
        System.out.println("Enter the array elements: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int max_number = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max_number) {
                max_number = arr[i];
            }
        }
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Maximum number of the array is: " + max_number);
        sc.close();
    }
}