/*WAP TO PRINT REVERSE STAR PATTERN */
package Day9;
import java.util.Scanner;
public class Question33 {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of rows: ");//taking input(number of rows) from user
    int rows = sc.nextInt();
    for (int i=rows; i>=1; i--){//(applying for loop)outer loop for rows
        for (int j=1; j<=i; j++){//inner loop for columns
            System.out.print("*");//printing the reverse star pattern
        }
        System.out.println();//new line after each row
    }
    sc.close();

}}
