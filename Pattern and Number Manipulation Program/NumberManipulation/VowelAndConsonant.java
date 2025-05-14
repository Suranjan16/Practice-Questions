
import java.util.Scanner;

public class VowelAndConsonant {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a letter: ");
        char ch1 = sc.nextLine().charAt(0);
        

        if (ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u' || ch1 == 'A' || ch1 == 'E' || ch1 == 'I' || ch1 == 'O' || ch1 == 'U') {
            System.out.println(ch1 + " is vowel.");
        } else if ((ch1 >= 'A' && ch1 <= 'Z') || (ch1 >= 'a' && ch1 <= 'Z')) {
            System.out.println(ch1 + "is a consonant.");
        } else {
            System.out.println("Please enter valid character.");
        }
    }
}
