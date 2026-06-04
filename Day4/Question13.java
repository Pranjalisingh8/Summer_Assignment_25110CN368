/*WAP TO GENERATE FIBONACCI SERIES. */
package Day4;
import java.util.Scanner;
public class Question13 {
    public static void main(String[] args) {
        int Num, a = 0, b = 1, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms:");
        Num = sc.nextInt();
        System.out.print("Fibonacci Series: " + a + " " + b);
        for (int i = 2; i < Num; i++) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
        sc.close();
    }
    
}
