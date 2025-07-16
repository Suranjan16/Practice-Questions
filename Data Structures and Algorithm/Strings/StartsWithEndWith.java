
import java.util.Scanner;

public class StartsWithEndWith {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        System.out.println("String starts with \"Hello\"? " + a.startsWith("Hello"));
        System.out.println("String ends with \"Java\"? " + a.startsWith("Java"));
        System.out.println("Is the string empty? "  + a.isEmpty());
        String regex = "[a-zA-Z]+";
        System.out.println("Is the string contains only letters? " + a.matches(regex));
        sc.close();
    }
}
