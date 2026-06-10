/*WAP TO PRINT STAR PYRAMID PATTERN*/
package Day10;
import java.util.Scanner;
public class Question37 {
    public static void main(String[] args) {
        int i,j,k,rows;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        rows = sc.nextInt();
        for(i=1; i<=rows; i++){//(applying for loop)outer loop for rows
            for(j=1; j<=rows-i; j++){//inner loop for spaces
                System.out.print(" ");//printing space before stars
        
            }
            for(k=1; k<=2*i-1; k++){//inner loop for stars
                System.out.print("*");//printing stars
            }
            System.out.println();//moving to the next line

        }
        sc.close();
    }}

