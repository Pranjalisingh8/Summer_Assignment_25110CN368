/*WAP TO PRINT THE LARGEST PRIME FACTOR */
package Day5;
import java.util.Scanner;
public class Question20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int largestPrimeFactor = -1;
        for (int i = 2; i <= num; i++) {
            while (num % i == 0) {
                largestPrimeFactor = i;
                num /= i;
            }
        }
        if (largestPrimeFactor != -1) {
            System.out.println("The largest prime factor is: " + largestPrimeFactor);
        } else {
            System.out.println("No prime factors found.");
        }
        sc.close();
    }
    
}
