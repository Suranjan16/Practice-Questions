
import java.util.Arrays;
import java.util.Scanner;

public class StringTypeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        sc.nextLine();
        String[]arr =  new String[size];
        System.out.println("Enter the names: ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLine();
        }
        System.out.println("Array: " + Arrays.toString(arr));
    }
}
