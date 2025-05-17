public class Ex1 {
    public static void main(String[] args) {
        Greeter g = (name) -> {
            System.out.println("Name: " + name);
        };

        g.greet("Suranjan");
    }
}

interface Greeter {
    void greet(String name);
}