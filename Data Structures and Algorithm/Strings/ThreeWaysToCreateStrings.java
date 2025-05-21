public class ThreeWaysToCreateStrings {
    public static void main(String[] args) {
        
        String s1 = "Suranjan";
        String s2 = new String("Suchayan");
        char[] arr = {'S', 'u', 'm','i','t'};
        String s3 = new String(arr);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
