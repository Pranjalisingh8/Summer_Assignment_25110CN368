/*WAP TO COUNT WORDS IN A SENTENCE */
package Day22;
import java.util.Scanner;
public class Question86 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence : ");
        String sentence = sc.nextLine().trim();
        //Handle empty input
        if(sentence.isEmpty()){
            System.out.println("Number of words: 0 ");
        }
        else{
            //Split by one or more whitespace
            String[]words = sentence.split("\\s+");
            System.out.println("Number of words: "+words.length);
        }
    sc.close();
}
    
}
