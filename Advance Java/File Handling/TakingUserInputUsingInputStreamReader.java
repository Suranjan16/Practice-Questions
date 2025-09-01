import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TakingUserInputUsingInputStreamReader {
    public static void main(String[] args) throws NumberFormatException, IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter Your Name: ");
        String name = br.readLine();
        System.out.println("Enter Your Age: ");
        int age = Integer.parseInt(br.readLine());

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
