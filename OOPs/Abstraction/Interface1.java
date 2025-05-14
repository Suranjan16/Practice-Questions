public class Interface1 {
    public static void main(String[] args) {
        Xys a = new Xys();
        a.sayan();
        a.suchayan();
        
        Suranjan.sumit();
    }
}

interface Suranjan {
    void suchayan();
    void sayan();

    static void sumit() {
        System.out.println("My name is Sumit Maity.");
    }
}

class Xys implements Suranjan {
    @Override
    public void suchayan() {
        System.out.println("My name is Suchayan Maity.");
    }
    @Override
    public void sayan() {
        System.out.println("My name is Sayan Maity.");
    }
}