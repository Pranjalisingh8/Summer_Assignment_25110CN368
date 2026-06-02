/*WAP TO CHECK WHETHER A NUMBER IS PALINDROME */
package Day2;
import java.util.Scanner;
public class Question8 {
    public static void main(String[] args) {
        
    int Num, i, rev = 0; // rev is the reversed number (obtained)
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number:");
    Num = sc.nextInt();
    while(Num>0){
        i = Num % 10;
        rev = rev * 10 + i;
        Num = Num/10;
        if (rev == Num)
           { System.out.println("Entered number is palindrome");
        }
        else
           { System.out.println("Entered number is not palindrome");}
        

    }
    sc.close();


    }
}
