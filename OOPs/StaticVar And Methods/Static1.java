class Static {

    static int a = 15; 

    public static void fun() {
        System.out.println("Learning is fun.");
    }

    int b = 20;
    public void fun1() {
        System.out.println("Coding is fun.");
    }
}

public class Static1 {
  
    public static void main(String[] args) {
        System.out.println("A = " + Static.a);
        Static.fun();

        Static st = new Static();
        System.out.println("B = " + st.b);
        st.fun1();
    }    
}