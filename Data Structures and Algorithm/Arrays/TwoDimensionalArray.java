
import java.util.Scanner;


public class TwoDimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the numbers of columns: ");
        int columns = sc.nextInt();

        int [][] marks = new int[rows][columns];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                marks[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}