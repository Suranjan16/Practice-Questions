
import java.util.Scanner;

public class ThirdHighestUsingBubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().trim().split("\\s+");
        int[] arr = new int[input.length];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        bubbleSort(arr);
        int count = 1;
        for(int i = 1; i < arr.length; i++) {
             if(arr[i] != arr[i - 1]) {
                count++;
                if(count == 3) {
                    int thirdHighest = arr[i];
                    System.out.println(thirdHighest);
                    return;
                }
             }
        }
        System.out.println("Less than 3 distinct elements.");
    }
    //Bubble sort in descending order
    public static void bubbleSort(int[]arr) {
      for(int i = 0; i < arr.length - 1; i++) {
        boolean swapped = false;
        for(int j = 0; j < arr.length - 1 - i; j++) {
            if(arr[j] < arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                swapped = true;
            }
        }
        if(!swapped) {
            break;
        }
      }
    }
}
