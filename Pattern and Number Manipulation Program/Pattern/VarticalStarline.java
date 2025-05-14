import java.util.Scanner;

public class VarticalStarline {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the row: ");
        int rows = sc.nextInt();

        for(int i = 1; i <= rows; i++) {
            System.out.println("*");
        }
        sc.close();
    }
}
