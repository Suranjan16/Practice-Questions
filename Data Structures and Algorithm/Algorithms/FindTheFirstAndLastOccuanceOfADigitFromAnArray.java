
import java.util.Arrays;
import java.util.Scanner;

public class FindTheFirstAndLastOccuanceOfADigitFromAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an array: ");
        String[]a = sc.nextLine().trim().split("\\s+");
        int[] x = new int[a.length];
        for(int i = 0; i < x.length; i++) {
            x[i] = Integer.parseInt(a[i]);
        }
        System.out.println("Enter an element which you want to find: ");
        int b = sc.nextInt();

        int[] y = linearSearch(x, b);
        System.out.println(Arrays.toString(y));
    }

    public static int[] linearSearch(int[]arr, int a) {
        int first = -1;
        int last = -1;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == a) {
                if(first == -1) {
                    first = i;
                } 
                last = i;
            }
        }
        int[] arr1 = {first, last};
        return arr1;
    }
}
