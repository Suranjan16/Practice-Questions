
import java.util.Scanner;

public class NaturalNumbersSum {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Numbers n = new Numbers();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        n.totalSum(num);
        sc.close();
    }
}

class Numbers {
    void totalSum(int a) {
       int sum = 0;
       for (int i = 1; i <= a; i++) {
         sum += i;
       }
       System.out.println("Sum: " + sum);
    }
}