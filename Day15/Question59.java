/*WAP TO ROTATE ARRAY RIGHT */
package Day15;
import java.util.Scanner;
public class Question59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");//taking input for size of the array
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");//taking input for elements of the array
        for (int i = 0; i < n; i++) {//loop to input elements of the array
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number of positions to rotate right: ");//taking input for number of positions to rotate right
        int d = sc.nextInt();
        d = d % n; // To handle cases where d is greater than n
        System.out.println("Original array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Array after rotating right by " + d + " positions:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[(i - d + n) % n] + " ");//printing the elements of the array after rotating right by d positions
        }
        sc.close();
    }
    
}
