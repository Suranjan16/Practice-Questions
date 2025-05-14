import java.util.Scanner;

public class FinalVariable {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int c = sc.nextInt();
            A obj = new A();
            obj.calculate(c);
        }
    }
}

class A {
    final int a = 10;

    void calculate(final int b) {
        System.out.println("Result = " + (a * b));
    }
}