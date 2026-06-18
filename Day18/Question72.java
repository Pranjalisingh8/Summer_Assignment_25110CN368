/*WAP TO SORT ARRAY IN DESCENDING ORDER */
package Day18;
import java.util.Scanner;
public class Question72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int[]arr = new int[n];
        System.out.println("Enter "+n+" elements: ");
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
            // Selection sort for descending order
        for ( i = 0; i < n - 1; i++) {
            int maxIndex = i; // Find maximum instead of minimum

            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIndex]) { // > for descending
                    maxIndex = j;
                }
            }

            // Swap arr[i] with arr[maxIndex]
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }

        System.out.print("Array in descending order: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
    sc.close();
    
}}
