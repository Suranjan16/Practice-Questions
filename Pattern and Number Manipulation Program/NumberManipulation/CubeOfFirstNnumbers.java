
import java.util.Scanner;

public class CubeOfFirstNnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        cube(a);
    }

    public static void cube(int x) {
        for(int i = 1; i <= x; i++) {
            int cubeIS = i * i * i;
            System.out.println("The cube of " + i + " is: " + cubeIS);
        }
    }
}
