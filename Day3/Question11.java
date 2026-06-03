/*WAP TO FIND THE GCD OF TWO NUMBERS */
package Day3;
import java.util.Scanner;
public class Question11 {
    public static void main(String[] args) {
        int Num1, Num2, i, GCD = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        Num1 = sc.nextInt();
        System.out.println("Enter the second number");
        Num2 = sc.nextInt();
        for (i = 1; i <= Num1 &&  i<= Num2; i++)
        {
            if(Num1 % i == 0 && Num2 % i ==0){
                GCD = i;
            }
        }
        System.out.println(" GCD of the "+ Num1+" and " +Num2+" = "+GCD);

        
        sc.close();
    }
    
}

    

