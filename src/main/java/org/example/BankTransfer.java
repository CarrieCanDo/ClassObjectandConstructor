package org.example;

public class BankTransfer {
    public static void main(String[] args) {
        // Create two BankAccount objects
        BankAccount account1 = new BankAccount(5000.0, "Larry");
        BankAccount account2 = new BankAccount(300.0, "Mary");

        // Withdraw $100 from the first account
        account1.withdraw(100.0);
        // Deposit $100 into the second account
        account2.deposit(100.0);

        // Print updated account details in the desired format
        System.out.println(account1.getAccountHolderName() + "'s account balance: " + account1.getBalance());
        System.out.println(account2.getAccountHolderName() + "'s account balance: " + account2.getBalance());
    }
}
