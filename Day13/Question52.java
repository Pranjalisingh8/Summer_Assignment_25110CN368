/*WAP TO COUNT EVEN AND ODD ELEMENTS */
package Day13;
import java.util.Scanner;
public class Question52 {
    public static void main(String[] args) {
        int i, n, arr[], evenCount = 0, oddCount = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        n = sc.nextInt();
        arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("The number of even elements in the array is: " + evenCount);
        System.out.println("The number of odd elements in the array is: " + oddCount);
        sc.close();
    }

}
