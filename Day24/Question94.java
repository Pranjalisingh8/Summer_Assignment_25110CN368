/*WAP TO COMPRESS A STRING */
package Day24;
import java.util.Scanner;
public class Question94 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter string: ");
        String input = sc.next(); // Reads a single word
        
        String compressed = "";
        int count = 1;

        for (int i = 0; i < input.length(); i++) {
            // Check if next character is the same
            if (i + 1 < input.length() && input.charAt(i) == input.charAt(i + 1)) {
                count++;
            } else {
                // Add character and its count to the result
                compressed += input.charAt(i) + "" + count;
                count = 1; // Reset count
            }
        }

        System.out.println("Result: " + compressed);
        sc.close();
    }
}

    
