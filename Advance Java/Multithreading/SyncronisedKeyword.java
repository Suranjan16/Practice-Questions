public class SyncronisedKeyword {
    public static void main(String[] args) {
       Doctors_clinic dc = new Doctors_clinic();
       Thread t1 = new Thread(dc);
       t1.setName("Suranjan");
       Thread t2 = new Thread(dc);
       t2.setName("Anjan");
       
       t1.start();
       t2.start();
    }
}

class Doctors_clinic implements Runnable {
    synchronized public void run() {
        try {
            String name = Thread.currentThread().getName();
            System.out.println(name + " entered the clinic");
            Thread.sleep(1000);
            System.out.println(name + " is getting treated");
            Thread.sleep(1000);
            System.out.println(name + " exited the clinic");
        } 
        catch (Exception e) {
            System.out.println("Exception handled");
        }
    }
}
