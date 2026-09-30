package task1 ;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        int rollNumber;
        double marks1, marks2, marks3;
        double total;
        double percentage;
        char grade;
        System.out.print("Enter Student Name: ");
        name = input.nextLine();
        System.out.print("Enter Roll Number: ");
        rollNumber = input.nextInt();
        System.out.print("Enter marks for Subject 1: ");
        marks1 = input.nextDouble();
        System.out.print("Enter marks for Subject 2: ");
        marks2 = input.nextDouble();
        System.out.print("Enter marks for Subject 3: ");
        marks3 = input.nextDouble();
        total = marks1 + marks2 + marks3;
        percentage = (total / 300) * 100;
        if (percentage >= 85) {
            grade = 'A';
        }
        else if (percentage >= 70) {
            grade = 'B';
        }
        else if (percentage >= 50) {
            grade = 'C';
        }
        else {
            grade = 'F';
        }
        System.out.println("\n----- Student Result -----");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);

        input.close();
    }
}