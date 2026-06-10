/*WAP TO WRITE FUNCTION FOR FIBONACCI */
package Day12;
import java.util.Scanner;
public class Question47 {
    public static int Fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int num = sc.nextInt();
        System.out.println("Fibonacci series up to " + num + " terms:");
        for (int i = 0; i < num; i++) {
            System.out.print(Fibonacci(i) + " ");
        }
        sc.close();
    }
}
