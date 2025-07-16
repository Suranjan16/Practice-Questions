public class EqualsVsEquals {
    @SuppressWarnings("StringEquality")
    public static void main(String[] args) {
        String a = "Suranjan";
        String b = "Suranjan";
        if(a == b)
        System.out.println("yes");
    }
}