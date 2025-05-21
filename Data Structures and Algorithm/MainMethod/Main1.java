public class Main1 {
    public static void main(String[] args) {
        System.out.println("Main method executing!");
        main();
        main(19);
    }

    public static void main() {
        System.out.println("Main overloaded method with 0 parameter executing!");
    }

    public static void main(int a) {
        System.out.println("Main overloaded method with 1 parameter executing!");
    }
}