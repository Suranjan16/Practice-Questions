
import java.util.Scanner;

public class SumOfEachPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[]arr = new int[size];
        System.out.println("Enter array element one by one: "); 
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int sum = arr[i] + arr[j];
                
                if(sum > max) {
                    max = sum;
                }
            }
        }
        System.out.println(max);
    }
}
