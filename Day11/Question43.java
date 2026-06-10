/*WAP TO WRITE FUNCTION TO CHECK PRIME */
package Day11;
import java.util.Scanner;
public class Question43 {
    public static int Prime(int num) {//function to check prime number
        if (num <= 1) {//checking if number is less than or equal to 1
            return 0;//returning 0 if number is not prime
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {//loop to check if number is divisible by any number from 2 to square root of the number
            if (num % i == 0) {//checking if number is divisible by any number from 2 to square root of the number
                return 0;//returning 0 if number is not prime
            }
        }
        return 1;//returning 1 if number is prime
       
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (Prime(num) == 1) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
        sc.close();
    }
    
}
