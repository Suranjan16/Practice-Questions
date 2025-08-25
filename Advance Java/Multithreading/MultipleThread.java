// package Advance Java.Multithreading;

public class MultipleThread {
    public static void main(String[] args) {
        TypeThread tt = new TypeThread();
        ErrorThread et = new ErrorThread();
        SaveThread st = new SaveThread();
        String name = Thread.currentThread().getName();
        System.out.println("name = " + name);
        tt.start();
        et.start();
        st.start();
    }
}

class TypeThread extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Typing.....");
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println("Exception Handled!");
        }
    }
}

class ErrorThread extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Error checking.....");
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println("Exception Handled!");
        }
    }
}

class SaveThread extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Saving.....");
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println("Exception Handled!");
        }
    }
}
