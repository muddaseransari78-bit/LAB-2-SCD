package task1;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double balance = 10000;
        double amount;
        int choice;
        while (true) {
            System.out.println("\n----- ATM MENU -----");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            if (choice == 1) {
                System.out.print("Enter deposit amount: ");
                amount = input.nextDouble();
                if (amount > 0) {
                    balance = balance + amount;
                    System.out.println("Deposit successful.");
                    System.out.println("New Balance: Rs. " + balance);
                }
                else {
                    System.out.println("Invalid amount.");
                }
            }
            else if (choice == 2) {
                System.out.print("Enter withdrawal amount: ");
                amount = input.nextDouble();
                if (amount <= 0) {
                    System.out.println("Invalid amount.");
                }
                else if (amount > balance) {
                    System.out.println("Insufficient balance.");
                }
                else {
                    balance = balance - amount;
                    System.out.println("Withdrawal successful.");
                    System.out.println("New Balance: Rs. " + balance);
                }
            }
            else if (choice == 3) {
                System.out.println("Current Balance: Rs. " + balance);
            }
            else if (choice == 4) {

                System.out.println("Thank you for using ATM.");
                break;

            }
            else {

                System.out.println("Invalid choice.");

            }
        }

        input.close();
    }
}