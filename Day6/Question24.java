/*WAP TO FIND x^n WITHOUT POW() */
package Day6;
import java.util.Scanner;
public class Question24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base number (x):");//taking the base number as input
        double x = sc.nextDouble();
        System.out.println("Enter the exponent (n):");//taking the exponent as input
        int n = sc.nextInt();
        double result = 1;//initializing the result variable to 1
        for (int i = 0; i < n; i++) {//using for loop to multiply x with itself n times
            result *= x;
        }
        System.out.println(x + " raised to the power of " + n + " is: " + result);
        sc.close();
    }
    
}
