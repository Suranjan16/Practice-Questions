import java.util.Scanner;

public class PrintSecondHeightestUsingSelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[]arr = sc.nextLine().trim().split("\\s+");
        int[] a = new int[arr.length];
        for(int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(arr[i]);
        }
        selectionSort(a);
        int count = 1;
        for(int i = 1; i < a.length; i++) {
            if(a[i] != a[i - 1]) {
                count++;
                if(count == 2) {
                    int secondMax =  a[i];
                    System.out.println(secondMax);
                    return;
                }
            }
        }
    }
    
    public static void selectionSort(int[]a) {
        for(int i = 0; i < a.length - 1; i++) {
            int minIndex = i;
            for(int j = i + 1; j < a.length; j++) {
                if(a[j] > a[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
        }
    }
}
