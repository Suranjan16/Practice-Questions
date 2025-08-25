// package Advance Java.Multithreading;

public class SingleThreadedApplication {
    public static void main(String[] args) throws InterruptedException {
        String name = Thread.currentThread().getName();
        System.out.println(name);
        for(int i = 1; i <= 10; i++) {
          System.out.println("typing......");
          Thread.sleep(1000);
        }
        for(int i = 1; i <= 10; i++) {
          System.out.println("error checking......");
          Thread.sleep(1000);
        }
        for(int i = 1; i <= 10; i++) {
          System.out.println("saving......");
          Thread.sleep(1000);
        }
    }
}
