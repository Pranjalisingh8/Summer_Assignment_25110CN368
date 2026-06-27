package Day27;
import java.util.Scanner;
public class Question107 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Salary Calculator ===");
        
        System.out.print("Enter Basic Salary: ₹");
        double basic = sc.nextDouble();
        
        // Fixed 10% deduction
        double deduction = basic * 0.10;
        double netSalary = basic - deduction;
        
        System.out.println("\nBasic Salary: ₹" + basic);
        System.out.println("Deduction (10%): ₹" + deduction);
        System.out.println("Net Salary: ₹" + netSalary);

        sc.close();
    }
}
    

