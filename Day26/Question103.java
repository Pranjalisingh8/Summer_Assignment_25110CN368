package Day26;
import java.util.Scanner;
public class Question103 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int correctPin = 1234;
        double balance = 5000.0; // initial balance
        int attempts = 0;
        boolean access = false;

        System.out.println("=== Welcome to ATM ===");

        // PIN Verification - 3 attempts max
        while (attempts < 3 && !access) {
            System.out.print("Enter your 4-digit PIN: ");
            int enteredPin = sc.nextInt();

            if (enteredPin == correctPin) {
                access = true;
                System.out.println("PIN correct. Access granted.");
            } else {
                attempts++;
                System.out.println("Incorrect PIN. Attempts left: " + (3 - attempts));
            }
        }

        if (!access) {
            System.out.println("Too many wrong attempts. Card blocked.");
            sc.close();
            return;
        }

        int choice;
        do {
            System.out.println("\n--- ATM Menu ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your current balance: ₹" + balance);
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ₹");
                    double deposit = sc.nextDouble();
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("₹" + deposit + " deposited successfully.");
                        System.out.println("New balance: ₹" + balance);
                    } else {
                        System.out.println("Invalid amount. Must be greater than 0.");
                    }
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ₹");
                    double withdraw = sc.nextDouble();
                    if (withdraw > 0 && withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("₹" + withdraw + " withdrawn successfully.");
                        System.out.println("Remaining balance: ₹" + balance);
                    } else if (withdraw > balance) {
                        System.out.println("Insufficient balance.");
                    } else {
                        System.out.println("Invalid amount.");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using our ATM. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please select 1-4.");
            }
        } while (choice != 4);

        sc.close();
    }
}
    

