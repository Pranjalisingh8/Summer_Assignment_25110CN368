/*WAP TO PRINT ARMSTRONG NUMBER IN A RANGE */
package Day4;
import java.util.Scanner;
public class Question16 {
    public static void main(String[] args) {
        int Num1, Num2, i, j, count;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        Num1 = sc.nextInt();
        System.out.println("Enter the second number:");
        Num2 = sc.nextInt();
        System.out.println("Armstrong numbers in the given range " + Num1 + " to " + Num2 + " are:");
        for (i = Num1; i <= Num2; i++) {
            count = 0;
            j = i;
            while (j != 0) {
                count++;
                j /= 10;
            }
            j = i;
            int sum = 0;
            while (j != 0) {
                int remainder = j % 10;
                sum += Math.pow(remainder, count);
                j /= 10;
            }
            if (sum == i) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
