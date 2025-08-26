public class DaemonThread {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread());
        MainThread mt = new MainThread();

        SupportThread st = new SupportThread();
        st.setDaemon(true);
        st.setPriority(1);

        mt.start();
        st.start();
    }
}

class MainThread extends Thread {
    public void run() {
        try {
            for(int i = 1; i <= 5; i++) {
                System.out.println("Main thread executing");
                Thread.sleep(1000);
            }
        } catch (Exception e) {
                System.out.println("Exception occured!");
        }
    }
}

class SupportThread extends Thread {
    public void run() {
        try {
            for(;;) {
               System.out.println("Support Thread executing");
               Thread.sleep(1000);
            }
        } catch (Exception e) {
               System.out.println("Exception occured!");
        }
    }
}
