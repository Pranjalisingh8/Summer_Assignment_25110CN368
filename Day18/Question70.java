/*WAP TO SELECTION SORT */
package Day18;
import java.util.Scanner;
public class Question70
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int[]arr = new int[n];
        System.out.println("Enter "+n+" elements: ");
        for(int i = 0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i<n-1; i++){
            int minIndex = i;//assume current position has minimum
            for(int j = i+1;j<n; j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            if(minIndex!= i){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
    
        }
        System.out.println("Sorted array: ");
        for(int num : arr){
            System.out.println(num+ " ");
        }
        sc.close();
        }
    
}
