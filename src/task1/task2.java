package task1;
import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        double distance;
        int fee;
        System.out.print("Enter Student Name: ");
        name = input.nextLine();
        System.out.print("Enter Distance from University (km): ");
        distance = input.nextDouble();
        if (distance <= 5) {
            fee = 2000;
        }
        else if (distance <= 10) {
            fee = 3500;
        }
        else if (distance <= 20) {
            fee = 5000;
        }
        else {
            fee = 7000;
        }
        System.out.println("\n----- Transport Details -----");
        System.out.println("Student Name: " + name);
        System.out.println("Distance: " + distance + " km");
        System.out.println("Monthly Fee: Rs. " + fee);
        input.close();
    }
}
