public class OOPs4 {
    public static void main(String[] args) {
        Book book = new Book();
        book.read();
    }
}

class Book { 
    public void read() {
        System.out.println("Book is being read.");
    }   
}