/*WAP TO FIND STRING LENGTH WITHOUT STRLEN() */
package Day21;
import java.util.Scanner;
public class Question81 {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        int i = 0;
        try {
            while (true) {
                str.charAt(i);
                i++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // loop breaks when index goes out of bounds
        }
         System.out.println("Length of string = " + i);
        sc.close();
    }
}