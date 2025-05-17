public class MathOperation {
    public static void main(String[] args) {
        Calculator c = (a, b) -> (a + b);
        System.out.println("Addition: " + c.add(5 , 6));
    }
} 

interface Calculator {
    int add(int a, int b);
}
