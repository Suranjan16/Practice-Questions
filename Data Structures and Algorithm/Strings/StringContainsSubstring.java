import java.util.Scanner;


public class StringContainsSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.nextLine();

        if(a.contains(b)) {
            System.out.println(a + " contains " + b);
        } else {
             System.out.println(a + " is not contain " + b);
        }
    }
}