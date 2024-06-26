package vn.edu.likelion.bank.model;

import vn.edu.likelion.bank.service.Account;
import vn.edu.likelion.bank.service.AccountService;

public class SavingsAccount extends Account implements AccountService {
    private double interestRate;
    private int years;

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return this.interestRate;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public int getYears() {
        return this.years;
    }

    public double calculateInterest() {
        return this.initialDeposit * (this.interestRate / 100) * this.years;
    }

    @Override
    public void deposit(double amount) {
        this.initialDeposit = amount;
    }

    @Override
    public double getBalance() {
        return this.initialDeposit;
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
        return "SavingsAccount{" +
                "id=" + id +
                ", initialDeposit= $" + initialDeposit +
                ", overdraftLimit= $" + overdraftLimit +
                ", interestRate=" + interestRate + "%" +
                ", years=" + years +
                '}';
    }
}



