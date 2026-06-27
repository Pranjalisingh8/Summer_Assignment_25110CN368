package Day27;
import java.util.Scanner;
public class Question108 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Simple Marksheet ===");
        
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter Marks in Maths: ");
        int maths = sc.nextInt();
        
        System.out.print("Enter Marks in Science: ");
        int science = sc.nextInt();
        
        System.out.print("Enter Marks in English: ");
        int english = sc.nextInt();
        
        // Calculation
        int total = maths + science + english;
        double percentage = total / 3.0;
        
        // Display
        System.out.println("\n--- MARKSHEET ---");
        System.out.println("Name: " + name);
        System.out.println("Maths: " + maths);
        System.out.println("Science: " + science);
        System.out.println("English: " + english);
        System.out.println("Total: " + total + "/300");
        System.out.println("Percentage: " + percentage + "%");

        sc.close();
    }
}
    

