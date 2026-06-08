/*WAP TO PRINT NUMBER TRIANGLE */
package Day8;
import java.util.Scanner;
public class Question30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");//taking input from user
        int rows = sc.nextInt();
        for (int i = 1; i <= rows; i++) {//(applying for loop)outer loop for rows
            for (int j = 1; j <= i; j++) {//inner loop for columns
                System.out.print(j + " ");//printing output pattern
            }
            System.out.println();//new line after each row
        }
        sc.close();
    }
}
