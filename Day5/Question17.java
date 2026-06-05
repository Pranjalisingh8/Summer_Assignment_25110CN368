/*WAP TO CHECK PERFECT NUMBER */
package Day5;
import java.util.Scanner;
public class Question17 {
    public static void main(String[] args) {
        int Num, i, Sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        Num = sc.nextInt();
        for (i = 1; i < Num; i++) {
            if (Num % i == 0) {
                Sum += i;
            }
        }
        if (Sum == Num) {
            System.out.println(Num + " is a perfect number.");
        } else {
            System.out.println(Num + " is not a perfect number.");
        }
        sc.close();
    }
    
}
