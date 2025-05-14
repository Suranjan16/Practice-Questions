import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the column number: ");
        int column = sc.nextInt();

        System.out.println("Enter the row number: ");
        int rows = sc.nextInt();

        for (int i = 1; i <= column; i++) {
            for (int j = 1; j <= rows; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        sc.close();
    }
}
