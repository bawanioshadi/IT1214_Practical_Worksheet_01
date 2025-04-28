public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(); // Creates an account with default values
        account.deposit(5000);                  // Deposits $5000
        account.withdraw(1500);                 // Withdraws $1500
        account.displayBalance();               // Displays balance ($3500)
    }
}