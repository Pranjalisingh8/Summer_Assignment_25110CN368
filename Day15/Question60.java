/*WAP TO MOVE ZEROES TO END */
package Day15;
import java.util.Scanner;
public class Question60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");//taking input for size of the array
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");//taking input for elements of the array
        for (int i = 0; i < n; i++) {//loop to input elements of the array
            arr[i] = sc.nextInt();
        }
        System.out.println("Original array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int count = 0; // Count of non-zero elements
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i]; // Move non-zero element to the front
            }
        }
        while (count < n) {
            arr[count++] = 0; // Fill remaining positions with zeroes
        }
        System.out.println("Array after moving zeroes to the end:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");//printing the elements of the array after moving zeroes to the end
        }
        sc.close();
    }
    
}
