package vn.edu.likelion.bank.service;

public interface AccountService {
    // withdraw money from the account, considering overdraft limit
    void withdraw(double amount, double overdraftLimit);

    // deposit money into the account
    void deposit(double amount);

    // get the current balance of the account
    double getBalance();

    // calculate and return the interest earned from the account
    double calculateInterest();
}

