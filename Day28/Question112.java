/*WAP TO CREATE CONTACT MANAGEMENT SYSTEM */
package Day28;
import java.util.Scanner;
public class Question112 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Contact Management System ===");
        
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter Phone Number: ");
        long phone = sc.nextLong();
        sc.nextLine();
        
        System.out.print("Enter Email: ");
        String email = sc.nextLine();
        
        System.out.println("\n--- Contact Details ---");
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
        System.out.println("Email: " + email);

        sc.close();
    }
}
    

