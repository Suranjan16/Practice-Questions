
import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[]a = sc.nextLine().trim().split("\\s+");
        int[]a1 = new int[a.length];
        for(int i = 0; i < a1.length; i++) {
            a1[i] = Integer.parseInt(a[i]);
        }
        insertionSort(a1);
    }
    public static void insertionSort(int[]a) {
        for(int i = 1; i < a.length; i++) {
            int key = a[i];
            int j = i - 1;
            while(j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }
        System.out.println(Arrays.toString(a));
    }
}
