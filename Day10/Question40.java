/*WAP TO PRINT CHARACTER PYRAMID PATTERN
    A 
   ABA 
  ABCBA 
 ABCDCBA 
ABCDEDCBA  */
package Day10;
import java.util.Scanner;
public class Question40 {
    public static void main(String[] args) {
        int i,j,k,rows;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        rows = sc.nextInt();
        for(i=1; i<=rows; i++){//(applying for loop)outer loop for rows
            for(j=1; j<=rows-i; j++){//inner loop for spaces
                System.out.print(" ");//printing space before characters
        
            }
            for(k=1; k<=i; k++){//inner loop for characters in increasing order
                System.out.print((char)(k+64));//printing characters in increasing order
            }
            for(k=i-1; k>=1; k--){//inner loop for characters in decreasing order
                System.out.print((char)(k+64));//printing characters in decreasing order
            }
            System.out.println();//moving to the next line

        }
        sc.close();
       
    }
    
}
