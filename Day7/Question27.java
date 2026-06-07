/*WAP TO RECURSIVE SUM OF DIGITS */
package Day7;
import java.util.Scanner;
public class Question27 {
    public static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        } else {
            return (n % 10) + sumOfDigits(n / 10);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("Sum of digits: " + sumOfDigits(number));
        scanner.close();
    }
}
