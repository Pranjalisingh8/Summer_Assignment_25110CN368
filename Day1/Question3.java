/* WAP to find factorial of a number */
package Day1;
import java.util.Scanner;   
public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("The factorial of " + n + " is: " + factorial);
    }
}
