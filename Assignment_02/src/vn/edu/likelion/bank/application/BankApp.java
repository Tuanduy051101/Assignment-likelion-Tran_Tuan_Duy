package vn.edu.likelion.bank.application;

import vn.edu.likelion.bank.controller.Bank;
import vn.edu.likelion.bank.model.CurrentAccount;
import vn.edu.likelion.bank.model.SavingsAccount;

import java.util.Currency;
import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to the Bank App!");
            System.out.println("1. Current Account");
            System.out.println("2. Savings Account");
            System.out.println("0. Exit");

            System.out.println("Choose an account type: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("You are operating with Current Account.");
                    displayMenuCurrentAccount(bank, scanner);
                    break;
                case 2:
                    System.out.println("You are operating with Savings Account.");
                    displaySavingsAccount(bank, scanner);
                    break;
                case 0:
                    System.out.println("Thank you for using the Bank App!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void displayMenuCurrentAccount(Bank bank, Scanner scanner) {
        while (true) {
            System.out.println("Current Account Menu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. List all current accounts");
            System.out.println("0. Go back");

            System.out.println("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: {
                    CurrentAccount currentAccount = new CurrentAccount();

                    System.out.println("Enter account ID: ");
                    int currentAccountId = scanner.nextInt();
                    scanner.nextLine();

                    if (bank.findCurrentAccountById(currentAccountId) != null) {
                        System.out.println("Current account exists.");
                        break;
                    }
                    currentAccount.setId(currentAccountId);

                    System.out.println("Enter deposit amount: ");
                    double depositAmount = getValidInput(scanner);
                    currentAccount.deposit(depositAmount);

                    System.out.println("Enter overdraft limit: ");
                    double overdraftLimit = getValidInput(scanner);
                    currentAccount.setOverdraftLimit(overdraftLimit);

                    bank.addCurrentAccount(currentAccount);
                    break;
                }
                case 2: {
                    CurrentAccount currentAccount = new CurrentAccount();

                    System.out.println("Enter current account ID: ");
                    int currentAccountId = scanner.nextInt();
                    scanner.nextLine();

                    if (bank.findCurrentAccountById(currentAccountId) == null) {
                        System.out.println("Current account does not exist.");
                        break;
                    }

                    currentAccount = bank.findCurrentAccountById(currentAccountId);

                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = getValidInput(scanner);
                    currentAccount.withdraw(withdrawalAmount, currentAccount.getOverdraftLimit());

                    break;
                }
                case 3: {
                    CurrentAccount currentAccount = new CurrentAccount();

                    System.out.println("Enter current account ID: ");
                    int currentAccountId = scanner.nextInt();
                    scanner.nextLine();

                    if (bank.findCurrentAccountById(currentAccountId) == null) {
                        System.out.println("Current account does not exist.");
                        break;
                    }

                    currentAccount = bank.findCurrentAccountById(currentAccountId);

                    System.out.println("Balance: " + currentAccount.getBalance());
                    break;
                }
                case 4:
                    System.out.println("List of current accounts: ");
                    bank.displayCurrentAccountList();
                case 0:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void displaySavingsAccount(Bank bank, Scanner scanner) {
        while (true) {
            System.out.println("Savings Account Menu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Calculate Interest");
            System.out.println("5. List all savings accounts");
            System.out.println("0. Go back");

            System.out.println("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: {
                    SavingsAccount savingsAccount = new SavingsAccount();

                    System.out.println("Enter account ID: ");
                    int savingsAccountId = scanner.nextInt();
                    scanner.nextLine();

                    if (bank.findSavingsAccountById(savingsAccountId) != null) {
                        System.out.println("Savings account exists.");
                        break;
                    }
                    savingsAccount.setId(savingsAccountId);

                    System.out.println("Enter deposit amount: ");
                    double depositAmount = getValidInput(scanner);
                    savingsAccount.deposit(depositAmount);

                    System.out.println("Enter overdraft limit: ");
                    double overdraftLimit = getValidInput(scanner);
                    savingsAccount.setOverdraftLimit(overdraftLimit);

                    System.out.println("Enter interest rate: ");
                    double savingsInterest = getValidInput(scanner);
                    savingsAccount.setInterestRate(savingsInterest);

                    System.out.println("Enter years: ");
                    int years = scanner.nextInt();
                    scanner.nextLine();
                    savingsAccount.setYears(years);

                    bank.addSavingsAccount(savingsAccount);

                    break;
                }
                case 2: {
                    SavingsAccount savingsAccount = new SavingsAccount();

                    System.out.println("Enter current account ID: ");
                    int savingsAccountId = scanner.nextInt();
                    scanner.nextLine();

                    if (bank.findSavingsAccountById(savingsAccountId) == null) {
                        System.out.println("Savings account does not exist.");
                        break;
                    }

                    savingsAccount = bank.findSavingsAccountById(savingsAccountId);

                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = getValidInput(scanner);
                    savingsAccount.withdraw(withdrawalAmount, savingsAccount.getOverdraftLimit());

                    break;
                }
                case 3: {
                    SavingsAccount savingsAccount = new SavingsAccount();

                    System.out.println("Enter current account ID: ");
                    int savingsAccountId = scanner.nextInt();
                    scanner.nextLine();

                    if (bank.findSavingsAccountById(savingsAccountId) == null) {
                        System.out.println("Current account does not exist.");
                        break;
                    }

                    savingsAccount = bank.findSavingsAccountById(savingsAccountId);

                    System.out.println("Balance: " + savingsAccount.getBalance());
                    break;
                }
                case 4: {
                    SavingsAccount savingsAccount = new SavingsAccount();

                    System.out.println("Enter current account ID: ");
                    int savingsAccountId = scanner.nextInt();
                    scanner.nextLine();

                    if (bank.findSavingsAccountById(savingsAccountId) == null) {
                        System.out.println("Current account does not exist.");
                        break;
                    }

                    savingsAccount = bank.findSavingsAccountById(savingsAccountId);

                    System.out.println("After applying interest on Savings for " + savingsAccount.getYears() + "years" + savingsAccount.calculateInterest());
                }
                case 5:
                    System.out.println("List of savings accounts: ");
                    bank.displaySavingsAccountList();
                case 0:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static double getValidInput(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextDouble();
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid double.");
                scanner.nextLine();
            }
        }
    }

    public static int getValidInputId(Scanner scanner) {
        while (true) {
            try {
                System.out.println(" Enter account ID:  ");
                return scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid int.");
                scanner.nextLine();
            }
        }
    }
}
