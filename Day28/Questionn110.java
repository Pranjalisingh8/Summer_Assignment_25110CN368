/*WAP TO CREATE BANK ACCOUNT SYSTEM */
package Day28;
import java.util.Scanner;
public class Questionn110 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Bank Account System ===");
        
        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();
        
        System.out.print("Enter Initial Balance: ₹");
        double balance = sc.nextDouble();
        
        System.out.print("\nEnter Amount to Deposit: ₹");
        double deposit = sc.nextDouble();
        balance = balance + deposit;
        
        System.out.print("Enter Amount to Withdraw: ₹");
        double withdraw = sc.nextDouble();
        balance = balance - withdraw;
        
        System.out.println("\n--- Account Details ---");
        System.out.println("Name: " + name);
        System.out.println("Account No: " + accNo);
        System.out.println("Final Balance: ₹" + balance);

        sc.close();
    }
}

