import java.util.Arrays;
import java.util.Scanner;
public class CreatingAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
         int size = sc.nextInt();
            String[]a = new String[size];
            System.out.println("Enter the elements : ");
            for(int i = 0; i < a.length; i++) {
                a[i] = sc.next();
            }
            System.out.println("Arrays: " + Arrays.toString(a));
    }
}
