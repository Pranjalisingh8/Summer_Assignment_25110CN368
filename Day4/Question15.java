/*WAP TO CHECK THE ARMSTRONG NUMBER */
package Day4;
import java.util.Scanner;
public class Question15 {
    public static void main(String[] args) {
        int Num, temp, Remainder, Result = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        Num = sc.nextInt();
        temp = Num;
        while (temp > 0) {
            Remainder = temp % 10;
            Result += Math.pow(Remainder, 3);
            temp /= 10;
        }
        if (Result == Num) {
            System.out.println(Num + " is an Armstrong number.");
        } else {
            System.out.println(Num + " is not an Armstrong number.");
        }
        sc.close();
    }
    
}
