
import java.util.Scanner;

public class SumOfMinElementInEachRows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int a = sc.nextInt();

        System.out.println("Enter the number of columns: ");
        int b = sc.nextInt();

        int[][] arr = new int[a][b];

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.println("Enter the arr element for row: " + i + " column: " + j + ": ");
                arr[i][j] = sc.nextInt();
            }
        }
         System.out.println("Array: ");
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            int min = arr[i][0];
            for(int j = 1; j < arr[i].length; j++) {
                if(min > arr[i][j]) {
                    min = arr[i][j];
                }
            }
            System.out.println("Minimum of row "+ (i + 1) + ": " + min);
            sum += min;
        }
        System.out.println("Sum of minimum of each row: " + sum);
    }
}
