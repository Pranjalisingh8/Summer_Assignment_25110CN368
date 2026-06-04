/*WAP TO FIND nth FIBONACCI TERM */
package Day4;
import java.util.Scanner;
public class Question14 {
    public static void main(String[] args) {
        int Num, a = 0, b = 1, c = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the term number:");
        Num = sc.nextInt();
        if (Num == 1) {
            System.out.println("The " + Num + "st term of the Fibonacci series is: " + a);
        } else if (Num == 2) {
            System.out.println("The " + Num + "nd term of the Fibonacci series is: " + b);
        } else {
            for (int i = 3; i <= Num; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            System.out.println("The " + Num + "rd term of the Fibonacci series is: " + c);
        }
        sc.close();
    }
    }
