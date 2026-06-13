/*WAP TO INPUT AND DISPLAY ARRAY */
package Day13;
import java.util.Scanner;
public class Question49 {
    public static void main(String[] args) {
        int i, n, arr[];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        n = sc.nextInt();
        arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The elements of the array are:");
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }

}