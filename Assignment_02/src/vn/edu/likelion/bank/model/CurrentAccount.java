package vn.edu.likelion.bank.model;

import vn.edu.likelion.bank.service.Account;
import vn.edu.likelion.bank.service.AccountService;

public class CurrentAccount extends Account implements AccountService {

    @Override
    public void deposit(double amount) {
        this.initialDeposit = amount;
    }

    @Override
    public double getBalance() {
        return this.initialDeposit;
    }

    @Override
    public double calculateInterest() {
        return 0; // No interest for current accounts
    }

    @Override
    public void withdraw(double amount, double overdraftLimit) {
        if (initialDeposit >= amount && amount <= overdraftLimit) {
            initialDeposit -= amount;
            System.out.println("You have successfully withdrawn " + amount + " from your account.");
            System.out.println("Your current balance is: " + initialDeposit);
        } else if (amount > overdraftLimit) {
            System.out.println("Your overdraft limit has been exceeded. Please contact your bank for further assistance.");
        } else if (initialDeposit < amount) {
            System.out.println("Your account does not have enough money.");
        }
    }

    @Override
    public String toString() {
        return "CurrentAccount{" +
                "id=" + id +
                ", initialDeposit= $" + initialDeposit +
                ", overdraftLimit= $" + overdraftLimit +
                '}';
    }
}

