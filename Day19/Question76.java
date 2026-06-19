/*WAP TO FIND DIAGONAL SUM */
package Day19;
import java.util.Scanner;
public class Question76 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of square matrix: ");
        int n = sc.nextInt();

        int[][] mat = new int[n][n];
        System.out.println("Enter elements of " + n + "x" + n + " matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int primarySum = 0;
        int secondarySum = 0;

        for (int i = 0; i < n; i++) {
            primarySum += mat[i][i]; // Primary: row = col
            secondarySum += mat[i][n - 1 - i]; // Secondary: col = n-1-row
        }

        System.out.println("Primary diagonal sum: " + primarySum);
        System.out.println("Secondary diagonal sum: " + secondarySum);
        System.out.println("Total diagonal sum: " + (primarySum + secondarySum));

        // If n is odd, center element is counted twice
        if (n % 2!= 0) {
            int center = mat[n/2][n/2];
            System.out.println("Note: Center element " + center + " counted twice");
            System.out.println("Sum without double counting: " + (primarySum + secondarySum - center));
        }
        sc.close();
    }
    
}
