
import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] a = sc.nextLine().trim().split("\\s+");
        int[] a1 = new int[a.length];
        for(int i = 0; i < a1.length; i++) {
            a1[i] = Integer.parseInt(a[i]);
        }
        selectionSort(a1);
    }
    public static void selectionSort(int[]a) {
        for(int i = 0; i < a.length - 1; i++) {
            int minIdx = i;
            for(int j = i + 1; j < a.length; j++) {
                if(a[j] < a[minIdx]) 
                minIdx = j;
            }
            int temp = a[i];
            a[i] = a[minIdx];
            a[minIdx] = temp;
        }
        System.out.println(Arrays.toString(a));
    }
}
