/*Practice (Attributes and Methods)

Core
Design a class BankAccount with the following specification :

Attributes :

accountNumber (string) : Represents the account number of the user's account
balance (double) : Represents the balance of the account
Constructor :

Implement a parameterised constructor to have the accountNumber and balance initialised while creating the object.
Methods :

deposit (double amount) : It adds the amount to the balance of the user's account.
withdraw (double amount) : It deducts the money (amount) from the balance. If the balance is insufficient then print "Insufficient funds!" and do not change the original amount.
displayDetails() : It displays the accountNumber and balance of the account.
Refer the sample examples for understanding the output format.

Note :

Use the exact output format given in example with matching case and whitespaces else may face wrong answers.

Use the name convention for classes and methods as given in the IDE commented code or the problem statement to avoid the compilation error.

All outputs should always be displayed with exactly 2 decimal places.

Example 1:
Input : accountNumber = "9662375274869" , balance = 8655 , addBalance = 5854 , withdrawBalance = 9437

Output :

Account Number : 9662375274869

Balance : 5072.00

Explanation :

The object of the class BankAccount is created using the parameterised constructor with accountNumber and balance as the two arguments to constructor.
Then the deposit() method is called with parameter addBalance.
Next the withdrawbalance() method is called with parameter withdrawBalance, Here the withdrawal balance is 9437 and Balance is 14509. So we can withdraw the given amount.
Next the displayDetails() method is called which displays the account number and balance present in the account. */

//Your code goes here
import java.util.*;

class BankAccount{
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    private BankAccount(){
        accountNumber="";
        balance=0;
    }
    public void deposit(double addBalance){
        if(balance >= 0){
            balance += addBalance;
        } else {
            System.out.println("Balance is negetive, cannot deposit");
        }
    }
    public void withdraw(double withdrawBalance){
        if(withdrawBalance > balance){
            System.out.println("Insufficient funds!");
        } else {
            balance -= withdrawBalance;
        }
    }
    public void displayDetails(){
        System.out.println("Account Number : "+ accountNumber);
        System.out.printf("Balance : %.2f%n", balance);
    }
}




//Please Do not change anything below, It is only for your reference.
/*

This is the driver code that will execute and demonstrate the functionality of your `BankAccount` class.

It creates a object of class `BankAccount`, the objects sets the values of accountNumber and balance using the parameterised constructor.
Then calls the method addBalance to add the balance in the account.
Then it calls the withdrawBalance to withdraw the balance from the account.
At end it displays the details of account using the displayDetails method.



// Main class to demonstrate the functionality of the Student class
public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
            
        // Input account number and initial balance
        String accountNumber = sc.nextLine();
        double balance = sc.nextDouble();

        // Create a BankAccount object with the use of parameterised constructor
        BankAccount account = new BankAccount(accountNumber, balance);

        // Deposit money
        double addBalance = sc.nextDouble();
        account.deposit(addBalance);

        // Withdraw money
        double withdrawBalance = sc.nextDouble();
        account.withdraw(withdrawBalance);

        // Display account details
        account.displayDetails();

        sc.close(); // Close the scanner
    }
}

*/

/*
//Below is the output statements

System.out.println("Insufficient funds!");
System.out.println("Account Number : " + accountNumber);
System.out.println("Balance : " + balance);

*/