public class BankAccountManagement {
    public static void main(String[] args) {
        Bank b = new Bank();
        b.display();
        Bank b1 = new Bank("Sir123", "Sumit", 6666664.0);
        b1.display();
    }
}

class Bank {
    String bankAccount;
    String accountHolder;
    double balance;

    public Bank() {

    }
    static  {
        System.out.println("Static block executing.");
    }
    public Bank(String bankAccount, String accountHolder, double balance) {
        this.bankAccount = bankAccount;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
     
    {
        bankAccount = "unknown";
        accountHolder = "Unknown";
        balance = 0.0;
    }
    void display() {
        System.out.println("Bank Account: " + bankAccount);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Balance: " + balance);
    }
}
