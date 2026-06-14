/*WAP TO FIND THE FREQUENCY OF ELEMENTS IN AN ARRAY */
package Day14;
import java.util.Scanner;
public class Question54 {
    public static void main(String[] args) {
        int i, j, n, arr[], freq[];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        n = sc.nextInt();
        arr = new int[n];
        freq = new int[n];
        System.out.println("Enter the elements of the array:");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            freq[i] = -1; // Initialize frequency array with -1
        }
        for (i = 0; i < n; i++) {
            if (freq[i] == -1) { // Check if the element is not already counted
                int count = 1;
                for (j = i + 1; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        freq[j] = 0; // Mark as counted
                    }
                }
                freq[i] = count; // Store frequency
            }
        }
        System.out.println("Element\tFrequency");
        for (i = 0; i < n; i++) {
            if (freq[i] != 0) { // Print only unique elements and their frequencies
                System.out.println(arr[i] + "\t" + freq[i]);
            }
        }
        sc.close();
    }
    
}
