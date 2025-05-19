
import java.util.Scanner;

public class AverageOfEach3dColumnIn3DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int b = sc.nextInt();
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][][]arr = new int[b][r][c];

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                for(int k = 0; k < arr[i][j].length; k++) {
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }

        System.out.println("3D Array: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.println("Layer " + (i + 1) + ": ");
            for(int j = 0; j < arr[i].length; j++) {
                for(int k = 0; k < arr[i][j].length; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
        }


        for(int j = 0; j < r; j++) {
            for(int k = 0; k < c; k++) {
                int sum = 0;
                for(int i = 0; i < b; i++) {
                    sum += arr[i][j][k];
                }
                double average = sum / b;
                System.out.println("Average of each column (" + j + "," + k + "): " + average);
            }
        }
    }
}
