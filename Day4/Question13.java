/*WAP TO GENERATE FIBONACCI SERIES */
package Day4;
import java.util.Scanner;
public class Question13 {
    public static void main(String[] args) {
        int n, a = 0, b = 1, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms:");
        n = sc.nextInt();
        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
        sc.close();
    }

}
