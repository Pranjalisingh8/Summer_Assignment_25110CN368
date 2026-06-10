/*WAP TO WRITE FUNCTION FOR PALINDROME */
package Day12;
import java.util.Scanner;
public class Question45 {
    public static boolean Palindrome(int n) {//function to check if a number is a palindrome
        int original = n;
        int reversed = 0;
        while (n > 0) {//loop to reverse the number
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return original == reversed;//checking if the original number is equal to the reversed number
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");//taking input from the user
        int num = sc.nextInt();//storing the input in a variable
        if (Palindrome(num)) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }
        sc.close();
    }
}
