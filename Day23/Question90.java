/*WAP TO FIND FIRST REPEATING CHARACTER */
package Day23;
import java.util.Scanner;
public class Question90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    System.out.println("First repeating character: " + str.charAt(i));
                    sc.close();
                    return;
                }
            }
        }

        System.out.println("No repeating character found.");
        sc.close();
    }
}
    
    

