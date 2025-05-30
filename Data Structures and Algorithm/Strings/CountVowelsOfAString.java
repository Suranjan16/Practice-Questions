
import java.util.Scanner;

public class CountVowelsOfAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine().toLowerCase();
        char[]arr = a.toCharArray();

        int count = 0; 
        for(int letter: arr) {
            if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o'||letter == 'u') {
              count++;
            }
        }
        System.out.println("Vowel count of the string is: " + count);
    }
}