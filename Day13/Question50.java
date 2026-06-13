/*WAP TO FIND SUM AND AVERAGE OF ARRAYS */
package Day13;
import java.util.Scanner;
public class Question50 {
    public static void main(String[] args) {
        int i, n, arr[], sum = 0;
        double average;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        n = sc.nextInt();
        arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        average = (double) sum / n;
        System.out.println("The sum of the array is: " + sum);
        System.out.println("The average of the array is: " + average);
        sc.close();
    }
    
}
