/*WAP TO CHECK PALINDROME STRING */
package Day22;
import java.util.Scanner;
public class Question85 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        
        String original = str.toLowerCase().replaceAll("s+", "");
        
        String reversed = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        if (original.equals(reversed)) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }
        sc.close();
    }
}


    

