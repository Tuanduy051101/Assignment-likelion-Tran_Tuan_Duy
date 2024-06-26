package vn.edu.likelion.bank.controller;

import vn.edu.likelion.bank.model.CurrentAccount;
import vn.edu.likelion.bank.model.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private final List<CurrentAccount> currentAccountList;
    private final List<SavingsAccount> savingsAccountList;

    public Bank() {
        this.currentAccountList = new ArrayList<>();
        this.savingsAccountList = new ArrayList<>();
    }

    public void addCurrentAccount(CurrentAccount currentAccount) {
        this.currentAccountList.add(currentAccount);
        System.out.println("Current account added successfully.");
    }

    public void addSavingsAccount(SavingsAccount savingsAccount) {
        this.savingsAccountList.add(savingsAccount);
        System.out.println("Savings account added successfully.");
    }

    public void displayCurrentAccountList() {
        for(CurrentAccount currentAccount : this.currentAccountList) {
            System.out.println(currentAccount);
        }
    }

    public void displaySavingsAccountList() {
        for(SavingsAccount savingsAccount : this.savingsAccountList) {
            System.out.println(savingsAccount);
        }
    }

    public void getSavingsAccountList() {
        for(SavingsAccount savingsAccount : this.savingsAccountList) {
            System.out.println(savingsAccount);
        }
    }

    public SavingsAccount findSavingsAccountById(int id) {
        for (SavingsAccount account : this.savingsAccountList) {
            if (account.getId() == id) {
                return account;
            }
        }
        return null;
    }

    public CurrentAccount findCurrentAccountById(int id) {
        for (CurrentAccount account : this.currentAccountList) {
            if (account.getId() == id) {
                return account;
            }
        }
        return null;
    }


}
