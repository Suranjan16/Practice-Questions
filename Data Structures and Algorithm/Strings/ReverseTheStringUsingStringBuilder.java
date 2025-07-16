import java.util.Scanner;

public class ReverseTheStringUsingStringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        StringBuilder sb = new StringBuilder(a);
        sb.reverse();
        System.out.println(sb);
        sc.close();
    }
}
