/* WAP TO CALCULATE THE SUM OF FIRST N NATURAL NUMBERS */
package Day1;
import java.util.Scanner;
public class  Question1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print ("enter the value of n: ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i =1; i <= n; i++){
            sum =sum + i;
        }
        System.out.println("the sum of first " + n + " natural numbers is: " + sum);
    scanner .close();}
}

