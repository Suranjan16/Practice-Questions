import java.util.Scanner;

public class StringRotationCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        if(a.length() != b.length()) {
            System.out.println("The String \'" + b + "\' is not rotation of \'" + a + "\'");
        }

        String comb = a + a;
        if(comb.contains(b)) {
            System.out.println("The String \'" + b + "\' is a rotation of \'" + a + "\'");
        } else {
            System.out.println("The String \'" + b + "\' is not rotation of \'" + a + "\'");
        }
        sc.close();
    }
}
