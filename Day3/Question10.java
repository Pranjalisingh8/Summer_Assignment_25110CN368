/*WAP TO PRINT PRIME NUMBERS IN A RANGE */
package Day3;
import java.util.Scanner;
public class Question10 {
    public static void main(String[] args) {
        int Num1, Num2, i, j, count;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        Num1 = sc.nextInt();
        System.out.println("Enter the second number");
        Num2 = sc.nextInt();
        System.out.println("Prime numbers between "+Num1+" and "+Num2+" are:");
        for (i = Num1; i <= Num2; i++)
        {
            count = 0;
            for (j = 1; j <= i; j++)
            {
                if (i % j == 0)
                {
                    count++;
                }
            }
            if (count == 2)
            {
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
    
}
