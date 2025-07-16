
import java.util.Scanner;

public class AlphabaticallySortStringUsingBubbleSort{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a =  sc.nextLine();
        char[] c = bubbleSort(a);
        System.out.print("Sorted Array: ");
        for(char ch: c) {
            System.out.print(ch);
        }
    }
    public static char[] bubbleSort(String a) {
        char[]arr = a.toCharArray();
        for(int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;
            for(int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j + 1]) {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) {
                break;
            }
        }
        return arr;
    }
}