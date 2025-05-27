import java.util.Scanner;

public class IndexOfAndReplace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        char b = sc.nextLine().charAt(0);

        if(a.indexOf(b) >= 0) {
            System.out.println("The index of the first occurance is: " + a.indexOf(b));
        } else {
            System.out.println("Character not found!");
        }
    }
}
