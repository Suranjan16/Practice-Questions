
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[]a = new int[size];
        System.out.println("Enter array element one by one: ");
        for(int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the target element: ");
        int b = sc.nextInt();
        System.out.println("Array: " + Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("Sorted Array: " + Arrays.toString(a));
        int c = binarySearch(a, b);
        if(c == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found");
        }
    }

    public static int binarySearch (int[]arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left <= right) {
            int mid = (left + right) / 2;
            if(arr[mid] == target) {
                return arr[mid];
            }
            if(arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}