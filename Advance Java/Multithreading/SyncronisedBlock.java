public class SyncronisedBlock {
    public static void main(String[] args) {
        Task t = new Task();
        Thread t1 = new Thread(t);
        t1.setName("Suranjan");
        Thread t2 = new Thread(t);
        t2.setName("Sayan");

        t1.start();
        t2.start();
    }
}

class Task implements Runnable {
    public void run() {

        try {
            String name = Thread.currentThread().getName();
            System.out.println(name + "Exploring movies");
            System.out.println(name + "Exploring places");
            synchronized (this) {
                for(int i = 1; i <= 3; i++) {
                System.out.println(name + "Selecting seats");
                Thread.sleep(1000);
                }
            }
            System.out.println(name + "Exited");
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
