/*WAP TO CHECK STRING ROTATION */
package Day24;
import java.util.Scanner;
public class Question93 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String s1 = sc.nextLine();
        System.out.println("Enter the second string: ");
        String s2 = sc.nextLine();
        //check length first,then check if s2 is in s1+s2
        if(s1.length()==s2.length()&& (s1+s2).contains(s2)){
            System.out.println("Yes, it's a rotation");
        }
        else{
            System.out.println("No, not a rotation");
        }
        sc.close();
    }
    
}
