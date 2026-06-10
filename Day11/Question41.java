/*WAP  to Write function to find sum of two numbers.  */
package Day11;
import java.util.Scanner;
public class Question41 {
    public static int Sum(int num1, int num2) {//function to find sum of two numbers
        return num1 + num2;//returning the sum of two numbers
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");//taking input of first number from user
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");//taking input of second number from user
        int num2 = sc.nextInt();
        int result = Sum(num1, num2);//calling the function to find sum of two numbers
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + result);//printing the result
        sc.close();
    }
}

    

