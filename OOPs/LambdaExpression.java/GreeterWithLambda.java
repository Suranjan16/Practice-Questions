public class GreeterWithLambda {
    public static void main(String[] args) {
        Greeter g = () -> System.out.println("Hello, my name is Suranjan Maity.");
        g.greet();
    }
}

interface Greeter {
    void greet();
}
