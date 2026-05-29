/*WAP TO  COUNT DIGITS IN A NUMBER*/
package Day1;
import java.util.Scanner;
public class Question4 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number :");
        int number = scanner.nextInt();
        int count = 0;
        while (number > 0){
            number /= 10;
            count = count + 1;
        
        }
        System.out.println("the number of digits in the given number is: " + count);
        scanner.close();

    }
}
