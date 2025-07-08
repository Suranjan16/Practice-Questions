
import java.util.Scanner;

public class FirstNPrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        prime(a);
    }

    public static void prime(int x) {
       int count = 0;
       int number = 2;
       
       System.out.println("First " + x + " prime numbers are: ");
       while(count < x) {
        boolean isPrime = true;
           for(int i = 2; i <= number/2; i++) {
              if(number % i == 0) {
                isPrime = false;
                break;
              }
           }
           if(isPrime) {
            System.out.println(number + " ");
            count++;
           }
           number++;
       }
    }
}
