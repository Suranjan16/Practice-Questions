public class UpcastingInPaymentMethod {
    public static void main(String[] args) {
        PaymentApp p = new PaymentApp();
        p.pay();

        PaymentApp a = new Upi();
        a.pay();

        PaymentApp b = new wallet();
        b.pay();
    }
}

class PaymentApp {
    void pay() {
        System.out.println("Pay to buy things.");
    }
} 

class Upi extends  PaymentApp {
    @Override
    void pay() {
        System.out.println("Pay using upi.");
    }
}

class wallet extends  PaymentApp {
    @Override
    void pay() {
        System.out.println("Pay using wallet.");
    }
}

