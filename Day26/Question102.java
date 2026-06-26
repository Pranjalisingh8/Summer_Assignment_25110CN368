package Day26;
import java.util.Scanner;
public class Question102 {
    


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Voting Eligibility Checker ===");
        
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("Hello " + name + ", you are eligible to vote.");
            System.out.println("Your age is " + age + ". Minimum age required is 18.");
        } else {
            int yearsLeft = 18 - age;
            System.out.println("Sorry " + name + ", you are not eligible to vote yet.");
            System.out.println("You can vote after " + yearsLeft + " year(s).");
        }
        
        sc.close();
    }
}
    

