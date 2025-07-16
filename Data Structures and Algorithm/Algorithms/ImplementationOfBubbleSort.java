
import java.util.Arrays;
import java.util.Scanner;

public class ImplementationOfBubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().trim().split("\\s+");
        int[] arr1 = new int[arr.length];
        for(int i = 0; i < arr1.length; i++) {
            arr1[i] = Integer.parseInt(arr[i]);
        }
        int[]x = bubbleSort(arr1);
        System.out.println(Arrays.toString(x));
    }
    public static int[] bubbleSort (int[]a) {
      for(int i = 0; i < a.length - 1; i++) {
        boolean swapped = false;

           for(int j = 0; j < a.length - 1 - i; j++)  {  
               if(a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) 
             break;
        }
      return a;
    }
}
