import java.util.Scanner;

public class FindCharacterAtSpecificIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        int b = sc.nextInt();

        System.out.println("Character at position " + b + " is: " + a.charAt(b-1));
    }
}
