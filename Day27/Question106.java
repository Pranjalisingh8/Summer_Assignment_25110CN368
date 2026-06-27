package Day27;
import java.util.Scanner;
public class Question106 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Variables for 3 employees
        int id1 = 0, id2 = 0, id3 = 0;
        String name1 = "", name2 = "", name3 = "";
        double salary1 = 0, salary2 = 0, salary3 = 0;

        System.out.println("=== Employee Management System ===");
        System.out.println("Enter details for 3 employees");

        // Employee 1
        System.out.println("\nEmployee 1:");
        System.out.print("ID: ");
        id1 = sc.nextInt();
        sc.nextLine();
        System.out.print("Name: ");
        name1 = sc.nextLine();
        System.out.print("Salary: ");
        salary1 = sc.nextDouble();

        // Employee 2
        System.out.println("\nEmployee 2:");
        System.out.print("ID: ");
        id2 = sc.nextInt();
        sc.nextLine();
        System.out.print("Name: ");
        name2 = sc.nextLine();
        System.out.print("Salary: ");
        salary2 = sc.nextDouble();

        // Employee 3
        System.out.println("\nEmployee 3:");
        System.out.print("ID: ");
        id3 = sc.nextInt();
        sc.nextLine();
        System.out.print("Name: ");
        name3 = sc.nextLine();
        System.out.print("Salary: ");
        salary3 = sc.nextDouble();

        // Display All
        System.out.println("\n--- Employee List ---");
        System.out.println("ID: " + id1 + ", Name: " + name1 + ", Salary: ₹" + salary1);
        System.out.println("ID: " + id2 + ", Name: " + name2 + ", Salary: ₹" + salary2);
        System.out.println("ID: " + id3 + ", Name: " + name3 + ", Salary: ₹" + salary3);

        sc.close();
    }
}
    

