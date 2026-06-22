/*WAP TO CHARACTER FREQUENCY */
package Day22;
import java.util.Scanner;
public class Question87 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a sentence: ");
    String sentence = sc.nextLine();
    int[] freq = new int[256];//ASCII size
    for(int i=0; i<sentence.length(); i++){
        char ch = sentence.charAt(i);
        if (ch!= ' '){//skip spaces
            freq[ch]++;
        
        }
    }
    System.out.println("Character frequencies: ");
    for(int i = 0; i<256; i++){
        if(freq[i]>0){
            System.out.println((char)i +" : "+freq[i]);
        }
    }sc.close();
}
    
}
