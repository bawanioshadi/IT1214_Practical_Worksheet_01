public class BankAccount {
    private String accountHolderName;
    private double balance;

    // Default constructor (no args)
    public BankAccount() {
        this.accountHolderName = "Unknown";
        this.balance = 0.0;
    }

    // Constructor with name only
    public BankAccount(String accountHolderName) {
        this.accountHolderName = accountHolderName;
        this.balance = 0.0;
    }

    // Constructor with name and initial balance
    public BankAccount(String accountHolderName, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    // Deposit, withdraw, displayBalance methods (same as before)
    public void deposit(double amount) {
        if (amount > 0) balance += amount;
        else System.out.println("Deposit amount must be positive.");
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) balance -= amount;
            else System.out.println("Insufficient funds. Current balance: $" + balance);
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    public void displayBalance() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Current Balance: $" + balance);
    }
}