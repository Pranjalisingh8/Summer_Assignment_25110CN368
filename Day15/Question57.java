/*WAP TO REVERSE ARRAY */
package Day15;
import java.util.Scanner;
public class Question57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");//taking input for size of the array
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");//taking input for elements of the array
        for (int i = 0; i < n; i++) {//loop to input elements of the array
            arr[i] = sc.nextInt();
        }
        System.out.println("Original array:");//taking input for elements of the array
        for (int i = 0; i < n; i++) {//loop to input elements of the array
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Reversed array:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");//printing the elements of the array in reverse order
        }
        sc.close();
    }
}
