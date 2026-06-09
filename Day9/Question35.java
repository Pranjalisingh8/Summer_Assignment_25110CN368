/*WAP TO PRINT REPEATED CHARACTER PATTERN
A
BB
CCC
DDDD */
package Day9;
import java.util.Scanner;
public class Question35 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");//taking input from the user
        int rows = sc.nextInt();
        for(int i = 1; i <= rows; i++){//(applying for loop)outer loop for rows
            for(int j = 1; j <= i; j++){//inner loop for columns
                System.out.print((char)(65 + i - 1));//printing the repeated character pattern
            }
            System.out.println();//new line after each row
        }
        sc.close();
    }
    
}
