package vn.edu.likelion.employee.model;

import vn.edu.likelion.employee.service.Employee;

public class Programmer extends Employee {
    private int overtimeHours;
    private double hourlyRate;

    // setters and getters for overtime hours and hourly rate
    public int getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateTotalSalary() {
        return salary + (overtimeHours * hourlyRate);
    }

    @Override
    public void displayEmployeeInfo() {
        System.out.println("Manager Name: " + name);
        System.out.println("Base Salary: $" + salary);
        System.out.println("Overtime Hours: " + overtimeHours);
        System.out.println("Hourly Rate: $" + hourlyRate);
        System.out.println("Total Salary: $" + calculateTotalSalary());
    }
}

