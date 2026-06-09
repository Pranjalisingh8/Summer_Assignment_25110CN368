/*WAP TO PRINT HOLLOW SQUARE PATTERN 
*******
*     *
*     *
*     *
******* */
package Day9;
import java.util.Scanner;
public class Question36 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");//taking input from user
        int rows = sc.nextInt();
        for(int i=1; i<=rows; i++){//(applying for loop)outer loop for rows
            for(int j=1; j<=rows; j++){//inner loop for columns
                if(i==1 || i==rows || j==1 || j==rows){
                    System.out.print("*");//printing the hollow square pattern
                }
                else{
                    System.out.print(" ");//printing space in between the stars
                }
            }
            System.out.println();//new line after each row
        }
        sc.close();
    }
    
}
