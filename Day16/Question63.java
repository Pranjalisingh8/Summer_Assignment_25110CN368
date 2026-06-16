/*WAP TO FIND PAIR WITH GIVEN SUM */
package Day16;
import java.util.Scanner;
public class Question63 {
    public static void main(String[] args) {
        int i, j, n, arr[], targetSum;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        n = sc.nextInt();
        arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target sum: ");
        targetSum = sc.nextInt();
        boolean pairFound = false;
        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == targetSum) {
                    System.out.println("Pair found: (" + arr[i] + ", " + arr[j] + ")");
                    pairFound = true;
                }
            }
        }
        if (!pairFound) {
            System.out.println("No pair found with the given sum.");
        }
        sc.close();
    }
    
}
