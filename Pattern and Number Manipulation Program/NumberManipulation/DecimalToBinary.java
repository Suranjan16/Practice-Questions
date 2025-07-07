import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        dToB(x);
    }

    public static void dToB (int a) {
        String res = "";
        int b = a;
        while (a > 0) {
            res = (a % 2) + res;
            a /= 2;
        }
        System.out.println("The binary equivalant of " + b + " is: " + (res.isEmpty()? "0" : res));
    }
}
