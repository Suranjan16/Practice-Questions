public class Recursion {
    public static int recursion(int n) {
        if(n == 0 || n == 1) return 1;
        return (n * recursion(n - 1));
    }
    public static void main(String[] args) {
        int a = recursion(5);
        System.out.println(a);
    }
}
