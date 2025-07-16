
import java.util.Scanner;

public class AppendStringUsingStringBuffer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();
        String c = sc.next();

        StringBuffer sb = new StringBuffer();
        sb.append(a).append(b).append(c);

        System.out.println("Concatenated String : "  + sb);
        sc.close();
    }
}
