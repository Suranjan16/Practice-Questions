public class StaticBlock {
   
        static int a = 10;
        static int b;

        static {
            System.out.println("Static block is executing");
        }

        public static void fun() {
           System.out.println("Static method is executing");
           System.out.println("A = " + a);
           StaticBlock.b = 5;
           System.out.println("B = " + b);
        }
        public static void main(String[] args) {
            System.out.println("main method is executing");
            StaticBlock.fun();
        }
    }

