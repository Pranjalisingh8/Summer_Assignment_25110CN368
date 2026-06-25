/*WAP TO FIND COMMON CHARACTERS IN STRINGS */
package Day25;
import java.util.Scanner;
public class Question98 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String str1 = sc.nextLine();
        System.out.println("Enter the second string: ");
        String str2 = sc.nextLine();
        System.out.println("Common characters: ");
        //Check each characterin str1
        for(int i=0; i<str1.length();i++){
            char ch = str1.charAt(i);
            //If ch exists in str2 and not already printed
            if(str2.indexOf(ch) != -1 && str1.indexOf(ch) ==i ){
                System.out.println(ch+ " ");
            }
        }
        sc.close();
    }
    
}
