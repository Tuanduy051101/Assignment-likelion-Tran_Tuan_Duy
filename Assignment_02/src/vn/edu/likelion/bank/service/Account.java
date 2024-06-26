package vn.edu.likelion.bank.service;

public class Account {
    protected int id;
    protected double initialDeposit;
    protected double overdraftLimit;

    // getters and setters for id and overdraft limit
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return this.overdraftLimit;
    }

}
