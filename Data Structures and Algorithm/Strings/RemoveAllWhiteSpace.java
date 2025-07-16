
import java.util.Scanner;

public class RemoveAllWhiteSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        a = a.replaceAll("\\s", "");
        System.out.println(a);
        sc.close();
    }
}
