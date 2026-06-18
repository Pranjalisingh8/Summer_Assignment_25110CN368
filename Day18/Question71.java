/*WAP TO BINARY SEARCH */
package Day18;
import java.util.Scanner;
public class Question71 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int[]arr = new int[n];
        System.out.println("Enter "+n+"elements: ");
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter element to search: ");
        int key = sc.nextInt();
        int low = 0, high = n-1;
        int pos = -1;//-1 means not found
        while(low<=high){
            int mid = low + (high-low)/2;//avoids overflow
            if(arr[mid]==key){
                pos = mid;
                break;
            } else if (arr[mid] < key){
                low = mid + 1; //search right half
            }else {
                high = mid - 1; //search left half
            }
        } 
        if (pos == -1){
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: "+pos);
        }

    sc.close();
}
    
}
