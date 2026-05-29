/* WAP TO PRINT THE MULTIPLICATION OF THE GIVEN NUMBER */
package Day1;
import java.util.Scanner;
public class Question2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number:");
        int number = scanner.nextInt();
    System.out.println("the multiplication table of " + number + " is:");
    for (int i = 1; i <=10; i++){
        int result = number * i;
        System.out.println(number + " x " + i + " = " + result);


    }
    scanner.close();
    }
}
