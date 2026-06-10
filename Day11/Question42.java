/*WAP TO WRITE FUNCTION TO FIND MAXIMUM */
package Day11;
import java.util.Scanner;
public class Question42 {
    public static int Max(int num1, int num2) {//function to find maximum of two numbers
        if (num1 > num2) {//comparing two numbers
            return num1;//returning the maximum number
        } else {
            return num2;//returning the maximum number
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");//taking input of first number from user
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");//taking input of second number from user
        int num2 = sc.nextInt();
        int result = Max(num1, num2);//calling the function to find maximum of two numbers
        System.out.println("The maximum of " + num1 + " and " + num2 + " is: " + result);//printing the result
        sc.close();
    }
    
}
