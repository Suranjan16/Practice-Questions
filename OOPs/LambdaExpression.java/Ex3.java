public class Ex3 {
    public static void main(String[] args) {
        Calculator c = (a, b) -> {
            return (a-b);
        };
        System.out.println("Subtraction: " + c.substraction(10 , 5));
     }
}

interface Calculator {
    int substraction(int a, int b);
}