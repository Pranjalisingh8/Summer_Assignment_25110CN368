/*WAP TO CHECK WHETHER A NUMBER IS PRIME */
package Day3;
import java.util.Scanner;
public class Question9 {
public static void main(String[] args) {
    int Num,i, count = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number:");
    Num = sc.nextInt();
    for (i = 1; i<=Num; i++)
    {
        if ( Num % i == 0)
            {
            count++;
        }
    }
    if (count == 2){
        System.out.println(Num+" is a prime number.");
    }
        else{
            System.out.println(Num+" is not a prime number.");
        }
        sc.close();
    
}
    
}
