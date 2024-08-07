package oops.op;

public class BankAccount {
    // Private fields
    private double balance;
    private String accountNumber;

    // Constructor to initialize the account
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Public method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Public method to withdraw money
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    // Public method to get the current balance
    public double getBalance() {
        return balance;
    }

    // Public method to get the account number
    public String getAccountNumber() {
        return accountNumber;
    }

        public static void main(String[] args) {
            // Create a new bank account with an initial balance of 1000
            BankAccount account = new BankAccount("123456789", 1000.0);

            // Display the account number and initial balance
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Initial Balance: " + account.getBalance());

            // Deposit money into the account
            account.deposit(500.0);
            System.out.println("Balance after deposit: " + account.getBalance());

            // Withdraw money from the account
            if (account.withdraw(300.0)) {
                System.out.println("Withdrawal successful. Current Balance: " + account.getBalance());
            } else {
                System.out.println("Withdrawal failed. Insufficient balance.");
            }

            // Attempt to withdraw more money than the current balance
            if (account.withdraw(1500.0)) {
                System.out.println("Withdrawal successful. Current Balance: " + account.getBalance());
            } else {
                System.out.println("Withdrawal failed. Insufficient balance.");
            }
        }
    }


