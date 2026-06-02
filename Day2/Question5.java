/* WAP TO FIND THE SUM OF DIGITS OF A NUMBER */
package Day2;
import java.util.Scanner;
public class Question5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = scanner.nextInt();
        int sum = 0;
        while (number > 0){
            int digit = number % 10;
            sum = sum + digit;
            number /= 10;
            
        }
        System.out.println("Sum of digits: " + sum);
        scanner.close();
    }

}
