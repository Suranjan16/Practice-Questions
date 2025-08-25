public class CustomtThreadSetName {
    public static void main(String[] args) {
        String name = Thread.currentThread().getName();
        System.out.println("Name: " + name);

        MyThread mt = new MyThread();
        mt.setName("My_super Thread");
        mt.start();
    }
}

class MyThread extends Thread {
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println("Name: " + name);
    }
}
