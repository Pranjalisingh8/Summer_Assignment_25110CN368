/*WAP TO FIND THE SECOND LARGEST ELEMENT IN AN ARRAY */
package Day14;
import java.util.Scanner;
public class Question55 {
    public static void main(String[] args) {
        int i, n, arr[], largest, secondLargest;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        n = sc.nextInt();
        arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        largest = Integer.MIN_VALUE;
        secondLargest = Integer.MIN_VALUE;
        for (i = 0; i < n; i++) {
            if (arr[i] > largest) {
                secondLargest = largest; // Update second largest before updating largest
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element in the array.");
        } else {
            System.out.println("The second largest element in the array is: " + secondLargest);
        }
        sc.close();
    }
    
}
