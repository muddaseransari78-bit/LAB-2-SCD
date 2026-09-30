package task1;
import java.util.Scanner;
public class task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1;
        double num2;
        int choice;
        double result;
        System.out.print("Enter first number: ");
        num1 = input.nextDouble();
        System.out.print("Enter second number: ");
        num2 = input.nextDouble();
        System.out.println("\n----- CALCULATOR MENU -----");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your choice: ");
        choice = input.nextInt();
        if (choice == 1) {
            result = num1 + num2;
            System.out.println("Result: " + result);
        }
        else if (choice == 2) {
            result = num1 - num2;
            System.out.println("Result: " + result);
        }
        else if (choice == 3) {
            result = num1 * num2;
            System.out.println("Result: " + result);
        }
        else if (choice == 4) {
            if (num2 != 0) {
                result = num1 / num2;
                System.out.println("Result: " + result);
            }
            else {
                System.out.println("Cannot divide by zero.");
            }
        }
        else {
            System.out.println("Invalid choice.");

        }

        input.close();
    }
}
