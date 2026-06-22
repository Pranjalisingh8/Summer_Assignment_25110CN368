/*WAP TO REMOVE SPACES FROM STRING */
package Day22;
import java.util.Scanner;
public class Question88 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        String result = " ";
        for(int i =0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (ch!= ' '){//skip spaces
                result += ch;
            }
        }
        System.out.println("String without spaces: " +result);
        sc.close();
    }
    
}
