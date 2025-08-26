public class ProducerConsumerProblem {

    public static void main(String[] args) {
        PizzaHouse ph = new PizzaHouse();
        Chef c = new Chef(ph);
        Customer cu = new Customer(ph);

        c.start();
        cu.run();
    }
}

class Chef extends Thread {
    PizzaHouse ph;
    public Chef(PizzaHouse ph) {
        this.ph = ph;
    }
    public void run() {
        ph.bake();
    }
}
class Customer extends Thread {
    PizzaHouse ph;
    public Customer (PizzaHouse ph) {
        this.ph = ph;
    }
    public void run() {
       ph.eat();
    }
}

class PizzaHouse {
    int token = 1;
    public void bake() {
        System.out.println("Chef is calling bake");
    }

    public void eat() {
        System.out.println("Customer is calling eat");
    }
}