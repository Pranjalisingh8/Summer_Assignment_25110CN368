/*WAP TO CREATE LIBRARY MANAGEMENT SYSTEM */
package Day28;
import java.util.Scanner;
public class Question109 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Simple Library ===");
        
        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Enter Book Name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter Author: ");
        String author = sc.nextLine();
        
        System.out.println("\n--- Book Details ---");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Author: " + author);

        sc.close();
    }
}
    

