/*WAP TO FIND MAXIMUM FREQUENCY ELEMENT */
package Day16;
import java.util.Scanner;
public class Question62 {
    public static void main(String[] args) {
        int i, j, n, arr[], maxFrequency = 0, mostFrequentElement = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        n = sc.nextInt();
        arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (i = 0; i < n; i++) {
            int frequency = 1; // Start with frequency 1 for the current element
            for (j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    frequency++; // Increment frequency if a match is found
                }
            }
            if (frequency > maxFrequency) {
                maxFrequency = frequency; // Update max frequency
                mostFrequentElement = arr[i]; // Update most frequent element
            }
        }
        System.out.println("The most frequent element in the array is: " + mostFrequentElement);
        sc.close();
    }
    
}
