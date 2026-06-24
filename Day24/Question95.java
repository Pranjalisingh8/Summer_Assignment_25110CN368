/*WAP TO FIND LONGEST WORD  */
package Day24;
import java.util.Scanner;
public class Question95 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = sc.nextLine();
        String[] words = sentence.split(" ");//split by space
        String longest = " ";
        for (String word: words){
            if(word.length()>longest.length()){
                longest = word;
            }
        }
        System.out.println("Longest word: "+longest);
        System.out.println("Length: "+longest.length());
        sc.close();
    }
    
}
