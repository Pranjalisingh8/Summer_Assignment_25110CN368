/*WAP TO CHECK ARMSTRONG NUMBER. */
/* An Armstrong number is a number that is equal to the sum of its digits each raised to the power of the number of digits. */
package Day4;
import java.util.Scanner;
public class Question15 {
    public static void main(String[] args){
        int Num, Sum = 0, R;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        Num = sc.nextInt();
        int Temp = Num;
        while (Num > 0) {
            R = Num % 10;
            Sum = Sum + (R * R * R);
            Num = Num / 10;
        }
        if (Sum == Temp) {
            System.out.println(Temp + " is an Armstrong number.");
        } else {
            System.out.println(Temp + " is not an Armstrong number.");
        }
        sc.close();
    }
}
    
        
    
    

