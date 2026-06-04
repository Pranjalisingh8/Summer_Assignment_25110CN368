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
        while (Num > 0) {
            Remainder = Num % 10;
            Result += Math.pow(Remainder, 3);
            Num /= 10;
        }
        if (Result == temp) {
            System.out.println(temp + " is an Armstrong number.");
        } else {
            System.out.println(temp + " is not an Armstrong number.");
        }
        sc.close();
    }
    
}
