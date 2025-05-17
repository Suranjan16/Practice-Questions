public class Ex2 {
    public static void main(String[] args) {
        Sum s = (a, b) -> {
            System.out.println("Sum = " + (a + b));
        };
        s.sum(29, 21);
    }
}

interface Sum {
    void sum(int a, int b);
}
