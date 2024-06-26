package vn.edu.likelion.employee.service;

public abstract class Employee {
    protected int id;
    protected String name;
    protected double salary;
    // abstract methods

    public abstract double calculateTotalSalary();
    public abstract void displayEmployeeInfo();

    // getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
