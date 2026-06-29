/*WAP TO CREATE A MENU DRIVEN CALACULATOR */
package Day29;
import java.util.Scanner;
public class Question113{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        double num1, num2, result;
        
        do {
            System.out.println("\n=== Calculator Menu ===");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            
            if(choice >= 1 && choice <= 4) {
                System.out.print("Enter first number: ");
                num1 = sc.nextDouble();
                System.out.print("Enter second number: ");
                num2 = sc.nextDouble();
            } else {
                num1 = num2 = 0;
            }
            
            switch(choice) {
                case 1:
                    result = num1 + num2;
                    System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                    break;
                    
                case 2:
                    result = num1 - num2;
                    System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                    break;
                    
                case 3:
                    result = num1 * num2;
                    System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                    break;
                    
                case 4:
                    if(num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                    } else {
                        System.out.println("Error: Cannot divide by zero!");
                    }
                    break;
                    
                case 5:
                    System.out.println("Exiting Calculator. Thanks!");
                    break;
                    
                default:
                    System.out.println("Invalid choice! Enter 1-5 only.");
            }
            
        } while(choice != 5);
        
        sc.close();
    }
}
