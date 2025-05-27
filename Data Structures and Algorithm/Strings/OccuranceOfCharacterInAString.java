
import java.util.Scanner;

public class OccuranceOfCharacterInAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine().toLowerCase();
        char ch = sc.nextLine().charAt(0);

        int count = 0;
        for(int i = 0; i <= a.length()-1; i++) {
            char b = a.charAt(i);
            if(b == ch) {
                count++;
            }
        }
        System.out.println(ch + ": " + count);
    }
}
