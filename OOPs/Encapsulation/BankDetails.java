
import java.util.Scanner;

public class BankDetails {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your account number: ");
        int a = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your password: ");
        String pass = sc.nextLine();
        Bank b = new Bank();
        System.out.println("Balance: " + b.getBalance(a, pass));
        b.setBalance(a, pass);

        sc.close();
    }
}

class Bank {
    private final int accountNumber = 10001;
    private final String bankPassword = "Sura101";
    private final double accountBalance = 6000000.0;

    public double  getBalance(int newAccountNumber, String userPassword) {
         if (newAccountNumber == accountNumber && bankPassword.equals(userPassword))
            return accountBalance;
         else 
            return 0;
    }

    public void setBalance(int newAccountNumber, String userPassword) {
        if (newAccountNumber == accountNumber && bankPassword.equals(userPassword)) {
        
        } else {
            System.out.println("Worng credentials!");
        }
    }
}