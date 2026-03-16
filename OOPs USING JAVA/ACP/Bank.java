package ACP;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// Interface
interface BankService {
    void deposit(double amount);
    void withdraw(double amount) throws Exception;
    void checkBalance();
}

// Class implementing the interface
class BankAccount implements BankService {

    double balance = 0;

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount Deposited: " + amount);
        writeToFile("Deposited: " + amount);
    }

    public void withdraw(double amount) throws Exception {
        if (amount > balance) {
            throw new Exception("Insufficient Balance!");
        }

        balance = balance - amount;
        System.out.println("Amount Withdrawn: " + amount);
        writeToFile("Withdrawn: " + amount);
    }

    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    // File handling
    void writeToFile(String message) {
        try {
            FileWriter fw = new FileWriter("transactions.txt", true);
            fw.write(message + "\n");
            fw.close();
        } catch (IOException e) {
            System.out.println("File Error!");
        }
    }
}

public class Bank {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount();

        int choice;

        do {
            System.out.println("\n1.Deposit");
            System.out.println("2.Withdraw");
            System.out.println("3.Check Balance");
            System.out.println("4.Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double d = sc.nextDouble();
                    account.deposit(d);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double w = sc.nextDouble();
                    try {
                        account.withdraw(w);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:
                    account.checkBalance();
                    break;

                case 4:
                    System.out.println("Thank you for using banking services.");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}