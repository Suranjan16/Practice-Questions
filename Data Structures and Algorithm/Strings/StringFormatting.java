
import java.util.Scanner;

public class StringFormatting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();

        System.out.println(String.format("My name is %s , i am %d years old.", name, age));
    }
}
