/*WAP TO PRINT nth TERM OF FIBONACCI SERIES */
package Day4;
import java.util.Scanner;
public class Question14 {
    public static void main(String[] args) {
        int Number, a = 0, b = 1, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the term number:");
        Number = sc.nextInt();
        if (Number == 1) {
            System.out.println("The " + Number + "st term of the Fibonacci series is: " + a);
        } else if (Number == 2) {
            System.out.println("The " + Number + "nd term of the Fibonacci series is: " + b);
        } else {
            for (int i = 3; i <= Number; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            System.out.println("The " + Number + "th term of the Fibonacci series is: " + b);
        }
        sc.close();}
    }
    