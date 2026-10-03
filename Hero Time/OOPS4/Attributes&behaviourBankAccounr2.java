import java.util.*;

class BankAccount {
    private String name; // to store the name of account holder
    private double balance; // to store the balance

    // Constructor
    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    // Method to set the name
    public void setName(String name) {
        this.name = name;
    }

    // Method to get the name
    public String getName() {
        return name;
    }

    // Method to get the balance
    public double getBalance() {
        return balance;
    }

    // Method to make a deposit
    public void deposit(double amount) {
        balance += amount; // Update the balance
    }

    // Method to make a withdrawal
    public boolean withdrawal(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient amount");
            return false;
        }
        balance -= amount; // Update the balance
        return true;
    }
}