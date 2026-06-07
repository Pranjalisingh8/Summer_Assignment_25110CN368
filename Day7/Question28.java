/*WAP TO RECURSIVE REVERSE NUMBER */
package Day7;
import java.util.Scanner;
public class Question28 {
    static int rev = 0;
    static void reverse(int num){
        if(num>0){
            rev = rev * 10 + num % 10;
            reverse(num / 10);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        reverse(number);
        System.out.println("Reversed number: " + rev);
        scanner.close();
    }
}

