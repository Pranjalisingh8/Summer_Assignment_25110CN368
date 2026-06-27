package Day27;
import java.util.Scanner;
public class Question105 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int roll1 = 0, roll2 = 0, roll3 = 0;
        String name1 = "", name2 = "", name3 = "";
        int count = 0;

        System.out.println("=== Simple Student Record ===");
        System.out.println("You can add 3 students");

        // Add Student 1
        System.out.println("\nEnter details of Student 1:");
        System.out.print("Roll No: ");
        roll1 = sc.nextInt();
        sc.nextLine();
        System.out.print("Name: ");
        name1 = sc.nextLine();
        count = 1;

        // Add Student 2
        System.out.println("\nEnter details of Student 2:");
        System.out.print("Roll No: ");
        roll2 = sc.nextInt();
        sc.nextLine();
        System.out.print("Name: ");
        name2 = sc.nextLine();
        count = 2;

        // Add Student 3
        System.out.println("\nEnter details of Student 3:");
        System.out.print("Roll No: ");
        roll3 = sc.nextInt();
        sc.nextLine();
        System.out.print("Name: ");
        name3 = sc.nextLine();
        count = 3;

        // Display All
        System.out.println("\n--- Student List ---");
        System.out.println("1. Roll No: " + roll1 + ", Name: " + name1);
        System.out.println("2. Roll No: " + roll2 + ", Name: " + name2);
        System.out.println("3. Roll No: " + roll3 + ", Name: " + name3);
        System.out.println("Total Students: " + count);

        sc.close();
    }
}
    

