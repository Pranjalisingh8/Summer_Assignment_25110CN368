/*WAP TO FIND THE LCM OF TWO NUMBERS */
package Day3;
import java.util.Scanner;
public class Question12 {
    public static void main(String[] args) {
        int Num1, Num2, LCM;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        Num1 = sc.nextInt();
        System.out.println("Enter the second number:");
        Num2 = sc.nextInt();
        LCM = (Num1 > Num2) ? Num1 : Num2;
        while (true) {
            if (LCM % Num1 == 0 && LCM % Num2 == 0) {
                System.out.println("LCM of " + Num1 + " and " + Num2 + " is: " + LCM);
                break;
            }
            LCM++;
        }
        sc.close();
    }

    }
    

