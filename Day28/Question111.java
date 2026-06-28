/*WAP TO CREATE TICKET BOOKING SYSTEM */
package Day28;
import java.util.Scanner;
public class Question111 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Ticket Booking System ===");
        
        System.out.print("Enter Your Name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter Movie Name: ");
        String movie = sc.nextLine();
        
        System.out.print("Enter Number of Tickets: ");
        int tickets = sc.nextInt();
        
        System.out.print("Enter Price per Ticket: ₹");
        double price = sc.nextDouble();
        
        // Calculation
        double total = tickets * price;
        
        System.out.println("\n--- Ticket Details ---");
        System.out.println("Name: " + name);
        System.out.println("Movie: " + movie);
        System.out.println("Tickets: " + tickets);
        System.out.println("Price per Ticket: ₹" + price);
        System.out.println("----------------------");
        System.out.println("Total Amount: ₹" + total);
        System.out.println("Booking Confirmed!");

        sc.close();
    }
}

