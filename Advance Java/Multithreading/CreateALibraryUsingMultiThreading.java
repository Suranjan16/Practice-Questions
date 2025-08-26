public class CreateALibraryUsingMultiThreading {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();
        YourThread yt = new YourThread();
        yt.start();
    }
}

class Library {
    String book1 = "Java";
    String book2 = "Sql";
    String book3 = "React";
    synchronized public void read() {
        synchronized(book1) {
            System.out.println("Reading " + book1);

            synchronized(book2) {
                System.out.println("Reading " + book2);
                synchronized(book3) {
                    System.out.println("Reading " + book3);
                }
                System.out.println("Finished " + book3);
            }
            System.out.println("Finished " + book2);
        }
        System.out.println("Finished " + book1);
    }
}

class MyThread extends Thread {
    Library lib = new Library();
    public void run() {
        lib.read();
    }
}
class YourThread extends Thread {
    Library lib = new Library();
    public void run() {
        lib.read();
    }
}