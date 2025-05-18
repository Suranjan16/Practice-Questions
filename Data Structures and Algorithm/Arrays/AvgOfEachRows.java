import java.util.Scanner;

public class AvgOfEachRows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int columns = sc.nextInt();

        int[][]arr = new int[rows][columns];
        
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

        for(int i = 0; i < arr.length; i++) {
            double sum = 0;
            for(int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            double avg = sum / arr[i].length;
            System.out.println("Average of row " + i + ": " + avg);
        }
    }
}
