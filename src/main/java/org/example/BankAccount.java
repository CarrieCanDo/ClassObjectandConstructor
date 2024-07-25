package org.example;

public class BankAccount {
    private double balance;
    private String accountHolderName;

    // Constructor
    public BankAccount(double balance, String accountHolderName) {
        this.balance = balance;
        this.accountHolderName = accountHolderName;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Getter for account holder name
    public String getAccountHolderName() {
        return accountHolderName;
    }

    // Method to print account details
    @Override
    public String toString() {
        return "Account Holder: " + accountHolderName + "\nBalance: $" + balance;
    }

    public static void main(String[] args) {
        // Instantiate a BankAccount object with 500 dollars
        BankAccount account = new BankAccount(500.0, "John Doe");

        // Deposit 100 dollars into the account
        account.deposit(100.0);

        // Print the account details to the console
        System.out.println("My Account balance: " + account.balance);
    }
}
