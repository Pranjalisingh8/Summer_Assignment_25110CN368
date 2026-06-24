/*WAP TO REMOVE DUPLICATE CHARACTERS */
package Day24;
import java.util.Scanner;
public class Question96 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        String result = " ";
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);// add char only if it's not already in result
            if (result.indexOf(ch)== -1){
                result = result + ch;
            }
        }
        System.out.println("After removing duplicates: "+result);
        sc.close();

    }
    
}
