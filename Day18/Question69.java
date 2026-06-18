/*WAP TO BUBBLE SORT */
package Day18;
import java.util.Scanner;
public class Question69{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nmumber of elements: ");
        int n = sc.nextInt();
        int []arr = new int[n];
    System.out.println("Enter "+n+" elements");
    for (int i = 0; i<n; i++){
        arr[i]=sc.nextInt();
    }
    boolean swapped;
    for (int i=0; i<n-1; i++){
        swapped = false;
        for(int j = 0; j<n-1-i; j++){
            if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                swapped = true;
            }
        }
        if(!swapped) break;
    }
    System.out.println("Sorted array: ");
    for(int num : arr){
        System.out.println(num+ " ");
    }
    sc.close();
   }

}