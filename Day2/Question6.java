/*WAP TO REVERSE A NUMBER */
package Day2;
import java.util.Scanner;
public class Question6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = sc.nextInt();
        int reversed = 0;
        while(number>0){ //when the enetred number is greater than zero
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        System.out.println("Reversed number: " + reversed);
        sc.close();
    }
}


