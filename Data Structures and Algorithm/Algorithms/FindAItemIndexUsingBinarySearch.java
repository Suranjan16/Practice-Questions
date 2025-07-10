
import java.util.Arrays;
import java.util.Scanner;

public class FindAItemIndexUsingBinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[]arr1 = sc.nextLine().split("\\s+");
        int[]arr2 = new int[arr1.length];
        for(int i = 0; i < arr1.length; i++) {
            arr2[i] = Integer.parseInt(arr1[i]);
        }
        int target = sc.nextInt();
        System.out.println("Array: " + Arrays.toString(arr2));
        int x = index(arr2, target);
        if (x == -1) {
            System.out.println("The target item not found.");
        } else {
            System.out.println("The target item found on the index:" + x);
        }
    }
    public static int index(int[]arr, int a) {
        int left = 0;
        int right = arr.length - 1;

        while(left <= right) {
            int mid = (left + right) / 2;
            if(arr[mid] == a) {
                return mid;
            } else if(mid < a) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
