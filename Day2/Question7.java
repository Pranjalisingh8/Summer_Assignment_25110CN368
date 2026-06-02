/*WAP TO FIND PRODUCT OF DIGITS */
package Day2;
import java.util.Scanner;
public class Question7 {
    public static void main(String[] args) {
       int Num, Remainder, Product;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number:");
       Num = sc.nextInt();
       for(Product = 1; Num > 0; Num = Num / 10)
       {
        Remainder = Num % 10;
        Product = Product * Remainder;
       }
       System.out.println("The product of digits of given number is " +Product);

       
    sc.close();
}
}
