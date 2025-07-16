
import java.util.Scanner;

public class CreatingAndDisplayingString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = a; 
        String c = new String(a);

        System.out.println("String created using double quote: "  + b);
        System.out.println("String created using new keyword: " + c);

        System.out.println("Is b = c? :" + (b == c));
        System.out.println("Is b.equals(c)? :" + b.equals(c));
        sc.close();
    }
}
