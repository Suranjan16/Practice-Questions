public class Book {
    public static void main(String[] args) {
        Book1 b1 = new Book1();
        b1.display();
        Book1 b2 = new Book1("Hallelujahh", "yashu", 1920);
        b2.display();
    }
}

class Book1 {
    String title;
    String author;
    int year;

    public Book1(String title,String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        System.out.println("Creating Book: " + this.title + ", " + this.author + ", " + this.year);
    }
    public Book1(String title, String author) {
        this(title, author,0);
    }
    public Book1(String title) {
        this(title,null,0);
    }
    public Book1() {
        this(null, null,0);
    }

    void display() {
        System.out.println("Author: " + this.author);
        System.out.println("Title: " + this.title);
        System.out.println("Year: " + this.year);
    }
}
