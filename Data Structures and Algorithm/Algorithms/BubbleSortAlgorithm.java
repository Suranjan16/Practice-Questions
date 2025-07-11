
import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().trim().split("\\s+");
        int[] array = new int[arr.length];
        for(int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(arr[i]);
        }
        int[] a = bubbleSort(array);
        System.out.println("Sorted Array: " + Arrays.toString(a));
    }
    public static int[] bubbleSort(int[]a) {
        for(int i = 0; i < a.length - 1; i++) {
            boolean swapped = false;
            for(int j = 0; j < a.length - 1 - i; j++) {
                if(a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) {
                break;
            }
        }
        return a;
    }
}
