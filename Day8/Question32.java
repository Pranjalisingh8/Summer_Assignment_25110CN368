/*WAP TO PRINT REPEATED NUMBER PATTERN
1
22
333
4444  */
package Day8;
import java.util.Scanner;
public class Question32 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");//taking input from the user
        int rows = sc.nextInt();
        for(int i=1; i<=rows; i++){//(applying for loop)outer loop for rows
        for(int j=1; j<=i; j++){//inner loop for columns}
            
                System.out.print(i);//printing the repeated number pattern
            }
            System.out.println();
        }
        sc.close();
     }
    
    }
