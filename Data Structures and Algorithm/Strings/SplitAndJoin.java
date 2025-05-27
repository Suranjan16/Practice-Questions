import java.util.Scanner;

public class SplitAndJoin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        String[]a1 = a.split(" ");

        System.out.println("Splited String: ");
        for(String words: a1) {
         System.out.println(words);
        }

        String joined = String.join(b, a1);
        System.out.println("Joined String: " + joined);
    }
}
