/*WAP TO PRINT nth TERM OF FIBONACCI SERIES */
package Day4;
import java.util.Scanner;
public class Question14 {
    public static void main(String[] args) {
        int n, a = 0, b = 1, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the term number:");
        n = sc.nextInt();
        if (n == 1) {
            System.out.println("The " + n + "st term of the Fibonacci series is: " + a);
        } else if (n == 2) {
            System.out.println("The " + n + "nd term of the Fibonacci series is: " + b);
        } else {
            for (int i = 3; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            System.out.println("The " + n + "rd term of the Fibonacci series is: " + b);
        }
        sc.close();
    }
    
}
