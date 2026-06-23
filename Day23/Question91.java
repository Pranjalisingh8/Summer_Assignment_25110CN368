/*WAP TO CHECK ANAGRAM STRING */
package Day23;
import java.util.Scanner;
public class Question91 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine().toLowerCase();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine().toLowerCase();

        if (str1.length() != str2.length()) {
            System.out.println("Not Anagram");
            sc.close();
            return;
        }

        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();

        // Sort first array
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    char temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        // Sort second array
        for (int i = 0; i < b.length - 1; i++) {
            for (int j = i + 1; j < b.length; j++) {
                if (b[i] > b[j]) {
                    char temp = b[i];
                    b[i] = b[j];
                    b[j] = temp;
                }
            }
        }

        boolean isAnagram = true;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                isAnagram = false;
                break;
            }
        }

        if (isAnagram) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }

        sc.close();
    }
}
        
    
    

