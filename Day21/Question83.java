/*WAP TO COUNT VOWELS AND CONSONANTS  */
package Day21;
import java.util.Scanner;
public class Question83 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
          System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int vowels = 0, consonants = 0;
        str = str.toLowerCase(); // convert to lowercase to handle A-Z and a-z

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') { // check if it's an alphabet
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        sc.close();
    }
}
        
    
    

