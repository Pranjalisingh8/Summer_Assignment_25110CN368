/*WAP TO PRINT CHARACTER PYRAMID */
package Day8;
import java.util.Scanner;
public class Question31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");//taking input from the user
        int rows = sc.nextInt();
        
        for(int i=1; i<=rows; i++){//(applying for loop)outer loop for rows
            for(char ch = 'A'; ch < 'A' + i; ch++){//inner loop for columns
                System.out.print(ch);//printing the character pyramid pattern
                }
                System.out.println();}
        sc.close();

       

    }
}
    

