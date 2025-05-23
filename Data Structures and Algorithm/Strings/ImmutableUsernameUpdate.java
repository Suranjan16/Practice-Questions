
import java.util.Scanner;

public class ImmutableUsernameUpdate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        String c =  a + b;
        System.out.println("Original:" + a);
        System.out.println("New String: " + c);
    }
}
