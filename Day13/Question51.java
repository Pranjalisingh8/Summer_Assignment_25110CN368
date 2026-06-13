/*WAP TO FIND LARGEST AND SMALLEST ELEMENT IN AN ARRAY*/
package Day13;
import java.util.Scanner;
public class Question51 {
    public static void main(String[] args) {
        int i, n, arr[], largest, smallest;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        n = sc.nextInt();
        arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        largest = arr[0];
        smallest = arr[0];
        for (i = 1; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        System.out.println("The largest element in the array is: " + largest);
        System.out.println("The smallest element in the array is: " + smallest);
        sc.close();
    }
    
}
