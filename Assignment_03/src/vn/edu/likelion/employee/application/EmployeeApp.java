package vn.edu.likelion.employee.application;

import vn.edu.likelion.employee.model.Manager;
import vn.edu.likelion.employee.model.Programmer;

import java.util.Scanner;

public class EmployeeApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create instances of Manager and Programmer
        Manager manager = new Manager();
        Programmer programmer = new Programmer();

        // Input values for Manager
        System.out.println("Enter Manager details:");
        System.out.print("ID: ");
        manager.setId(scanner.nextInt());
        scanner.nextLine(); // Consume newline
        System.out.print("Name: ");
        manager.setName(scanner.nextLine());
        System.out.print("Salary: ");
        manager.setSalary(scanner.nextDouble());
        System.out.print("Bonus: ");
        manager.setBonus(scanner.nextDouble());

        // Input values for Programmer
        System.out.println("Enter Programmer details:");
        System.out.print("ID: ");
        programmer.setId(scanner.nextInt());
        scanner.nextLine(); // Consume newline
        System.out.print("Name: ");
        programmer.setName(scanner.nextLine());
        System.out.print("Salary: ");
        programmer.setSalary(scanner.nextDouble());
        System.out.print("Overtime Hours: ");
        programmer.setOvertimeHours(scanner.nextInt());
        System.out.print("Hourly Rate: ");
        programmer.setHourlyRate(scanner.nextDouble());

        // Display employee information
        System.out.println("\nManager Information:");
        manager.displayEmployeeInfo();
        System.out.println("-------------------------------");
        System.out.println("Programmer Information:");
        programmer.displayEmployeeInfo();
    }
}

