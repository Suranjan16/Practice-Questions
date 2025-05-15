
import java.util.Scanner;

public class OddSumProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        Sum s = new Sum();
        s.totalSum(num);
        sc.close();
    }
}

class Sum {
    void totalSum(int a) {
        int sum = 0;
        for(int i = 1; i <= a; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("Sum: " + sum);
    }
}
