/*WAP TO LINEAR SEARCH */
package Day14;
import java.util.Scanner;
public class Question53 {
    public static void main(String[] args) {
        int i, n, arr[], key, index = -1;// Initialize index to -1 to indicate not found
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        n = sc.nextInt();
        arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to search: ");
        key = sc.nextInt();
        for (i = 0; i < n; i++) {
            if (arr[i] == key) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }
        sc.close();
    }
    
}
