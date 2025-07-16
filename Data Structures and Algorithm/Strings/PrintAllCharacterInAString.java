
import java.util.Scanner;

public class PrintAllCharacterInAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        char[]b = a.toCharArray();

        for(char ch: b) {
            System.out.println(ch);
        }
        sc.close();
    }
}
