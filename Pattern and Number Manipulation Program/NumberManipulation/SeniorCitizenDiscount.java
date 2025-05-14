
import java.util.Scanner;

public class SeniorCitizenDiscount {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int a = sc.nextInt();
        SrCitizen src = new SrCitizen();
        src.eligible(a);
        sc.close();
    }
}

class SrCitizen {

    void eligible(int age) {
        if (age >= 60) {
            System.out.println("you are eligible for discount.");
        } else {
            System.out.println("You are not eligible for discount.");
        }
    }
}