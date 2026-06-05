/*WAP TO CHECK THE STRONG NUMBER */
package Day5;
import java.util.Scanner;
public class Question18 {
    public static void main(String[] args) {
        int Num, Temp, Remainder, Factorial, Sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        Num = sc.nextInt();
        Temp = Num;
        while (Temp > 0) {
            Remainder = Temp % 10;
            Factorial = 1;
            for (int i = 1; i <= Remainder; i++) {
                Factorial *= i;
            }
            Sum += Factorial;
            Temp /= 10;
        }
        if (Sum == Num) {
            System.out.println(Num + " is a strong number.");
        } else {
            System.out.println(Num + " is not a strong number.");
        }
        sc.close();
    }
    
}