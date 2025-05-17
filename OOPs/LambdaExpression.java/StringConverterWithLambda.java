public class StringConverterWithLambda {
    public static void main(String[] args) {
        StringConverter stv = (s) -> s; 
        System.out.println(stv.convert("hello, world!"));
    }
}

interface StringConverter {
    String convert(String s);
}
