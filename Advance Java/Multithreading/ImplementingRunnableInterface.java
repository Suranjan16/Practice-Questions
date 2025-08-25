public class ImplementingRunnableInterface {
    public static void main(String[] args) {
        NumberPrinting numbers = new NumberPrinting();
        AlphabetPrinting alphabet = new AlphabetPrinting();

        Thread t1 = new Thread(numbers);
        Thread t2 = new Thread(alphabet);

        t1.start();
        t2.start();
    }
}

class NumberPrinting implements Runnable {
    public void run() {
        try {
            for(int i = 1; i <= 5; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println("Exception Handled");
        }
    }
}
class AlphabetPrinting implements Runnable {
    public void run() {
        try {
            for(char i = 'a'; i <= 'e'; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println("Exception Handled");
        }
    }
}