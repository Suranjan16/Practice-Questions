public class ExecutingTwoThread {
    public static void main(String[] args) {
        NumThread nt = new NumThread();
        nt.start();

        AlphabetThread at = new AlphabetThread();
        at.start();
    }
}

class NumThread extends Thread {
    public void run() {
        try {
            for(int i = 1; i <= 5; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        }
        catch (Exception ex) {
            System.out.println("Exception Handled");
        }
    }
}

class AlphabetThread extends Thread {
    public void run() {
        try {
            for(char c = 'a'; c <= 'a' + 4; c++) {
                System.out.println(c);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
                System.out.println("Exception handled");
        }
    }
}
