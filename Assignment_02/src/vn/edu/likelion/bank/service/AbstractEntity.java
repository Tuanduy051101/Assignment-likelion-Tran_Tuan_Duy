//package vn.edu.likelion.bank.service;
//
//public abstract class AbstractEntity implements AccountService {
//    protected int id;
//    protected double initialDeposit;
//    protected double overdraftLimit;
//
//    @Override
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    @Override
//    public int getId() {
//        return id;
//    }
//
//    @Override
//    public void setOverdraftLimit(double overdraftLimit) {
//        this.overdraftLimit = overdraftLimit;
//    }
//
//    @Override
//    public double getOverdraftLimit() {
//        return this.overdraftLimit;
//    }
//
//    @Override
//    public void deposit(double amount) {
//        this.initialDeposit = amount;
//    }
//
//    @Override
//    public void withdraw(double amount, double overdraftLimit) {
//        if (this.initialDeposit >= amount && amount <= overdraftLimit) {
//            this.initialDeposit -= amount;
//            System.out.println("You have successfully withdrawn " + amount + " from your account.");
//            System.out.println("Your current balance is: " + this.initialDeposit);
//        } else if (amount > overdraftLimit) {
//            System.out.println("Your overdraft limit has been exceeded. Please contact your bank for further assistance.");
//        } else if (this.initialDeposit < amount) {
//            System.out.println("Your account does not have enough money.");
//        }
//    }
//
//    @Override
//    public double getBalance() {
//        return this.initialDeposit;
//    }
//
//}
