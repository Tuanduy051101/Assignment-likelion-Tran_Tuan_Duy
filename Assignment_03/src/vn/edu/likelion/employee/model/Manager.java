package vn.edu.likelion.employee.model;

import vn.edu.likelion.employee.service.Employee;

public class Manager extends Employee {
    private double bonus;

    // setters and getters for bonus
    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double calculateTotalSalary() {
        return salary + bonus;
    }

    @Override
    public void displayEmployeeInfo() {
        System.out.println("Programmer Name: " + name);
        System.out.println("Base Salary: $" + salary);
        System.out.println("Bonus: $" + bonus);
        System.out.println("Total Salary: $" + calculateTotalSalary());
    }
}
