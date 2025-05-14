public class StaticComponent {
    static int a = 10;
    static int b;

    static {
       System.out.println("Static block is executing.");
    }

    public static void fun() {
        System.out.println("A = " + a);
        StaticComponent.b = 5;
        System.out.println("B = " + b);
        System.out.println("Static method is executing.");
    }

    public static void main(String[] args) {
        System.out.println("Main method is executing.");
        StaticComponent.fun();
    }
}
