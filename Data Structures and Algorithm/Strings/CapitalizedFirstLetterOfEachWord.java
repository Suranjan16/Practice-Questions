
import java.util.Scanner;

public class CapitalizedFirstLetterOfEachWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sen = sc.nextLine();
        
        String[]words = sen.trim().split(" ");
        StringBuilder sb = new StringBuilder();
        for(String word: words) {
            sb.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
        }

        System.out.print(sb.toString().trim());
    }
}
