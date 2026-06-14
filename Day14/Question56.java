/*WAP TO FIND DUPLICATES IN ARRAY */
package Day14;
import java.util.Scanner;
public class Question56 {
    public static void main(String[] args) {
        int i, j, n, arr[];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        n = sc.nextInt();
        arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The duplicate elements in the array are:");
        boolean hasDuplicates = false;
        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    hasDuplicates = true;
                    break; // Break to avoid printing the same duplicate multiple times
                }
            }
        }
        if (!hasDuplicates) {
            System.out.println("No duplicates found in the array.");
        }
        sc.close();
    }
    
}
