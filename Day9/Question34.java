/*WAP TO PRINT REVERSE NUMBER TRIANGLE  
12345
1234
123
12
1 */
package Day9;
import java.util.Scanner;
public class Question34 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");//taking input from the user
        int rows = sc.nextInt();
        for(int i = rows; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j);//printing the reverse number triangle pattern
            }
            System.out.println();
        }
        sc.close();
    }
    
}
