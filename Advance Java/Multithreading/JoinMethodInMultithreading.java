public class JoinMethodInMultithreading {

    public static void main(String[] args) throws InterruptedException {
        NumberThread nt = new NumberThread();
        AlphabetThread at = new AlphabetThread();

        nt.start();
        nt.join();

        at.start();
        at.join();

        System.out.println("Program execution ended");
    }
}

class NumberThread extends Thread {
    public void run() {
        try {
            for(int i = 1; i <= 5; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
                System.out.println("Exception occurs");
        }
    }
}
class AlphabetThread extends Thread {
    public void run() {
        try {
            for(char i = 'a'; i <= 'a' + 4; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
                System.out.println("Exception occurs");
        }
    }
}