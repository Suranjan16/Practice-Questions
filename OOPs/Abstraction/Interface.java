public class Interface {
    public static void main(String[] args) {
        
        MyCalculator a = new MyCalculator();
        a.add(5, 7);
        a.sub(10,8);
        a.mul(5,5);
        a.div(25,5);
    }
}

interface Calculator {
  void add(int a , int b);
  void sub(int a , int b);
} 
interface Calci {
    void mul (int a, int b);
    void div (int a, int b);
}

class MyCalculator implements Calculator, Calci {
    @Override
    public void add (int a, int b) {
       System.out.println("Sum : " + (a + b));
    }
    @Override
    public void sub (int a, int b) {
        System.out.println("Sub: " + (a - b));
    }
    @Override
    public void mul(int a, int b) {
        System.out.println("Product: " + (a*b));
    }
    @Override
    public void div (int a, int b) {
        System.out.println("Quotient: " + (a / b));
    }
}