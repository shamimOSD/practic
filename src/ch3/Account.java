package ch3;
// Inputting and outputting floating-point numbers with Account objects

import java.util.Scanner;

class Account {
    private double balance;


    public Account(double initialBalance) {
        if (initialBalance > 0.0)
            balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0.0)
            balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}
class AccountTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Account account1 = new Account(50.00);
        Account account2 = new Account(0.00);

        System.out.printf("account1 balance: tk%.2f%n", account1.getBalance());
        System.out.printf("account2 balance: tk%.2f%n", account2.getBalance());

        System.out.print("Enter deposit amount for account1: ");
        double depositAmount = input.nextDouble();
        System.out.printf("adding %.2f to account1 balance%n", depositAmount);
        account1.deposit(depositAmount);

        System.out.printf("account1 balance: tk%.2f%n", account1.getBalance());
        System.out.printf("account2 balance: tk%.2f%n", account2.getBalance());

        System.out.print("Enter deposit amount for account2: ");
        depositAmount = input.nextDouble();
        System.out.printf("adding %.2f to account2 balance%n", depositAmount);
        account2.deposit(depositAmount);

        System.out.printf("account1 balance: tk%.2f%n", account1.getBalance());
        System.out.printf("account2 balance: tk%.2f%n", account2.getBalance());


    }
}
