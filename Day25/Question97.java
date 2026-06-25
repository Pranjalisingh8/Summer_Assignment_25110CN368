/*WAP TO MERGE TWO SORTED ARRAYS */
package Day25;
import java.util.Scanner;
public class Question97 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input first array
        System.out.println("Enter the size of first array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter "+n1+" sorted elements:");
        for(int i = 0; i<n1; i++){
            arr1[i] = sc.nextInt();
        }
        //input second array 
        System.out.println("Enter the size of second array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter "+n2+" sorted elements:");
        for (int i = 0; i<n2; i++){
            arr2[i]= sc.nextInt();
        }
        //Merge logic
        int[] merged = new int[n1=n2];
        int i=0,j=0,k=0;
        while(i<n1 && j<n2){
            if (arr1[i]<= arr2[j]){
                merged[k++]=arr1[i++];
            } 
            else{
                merged[k++]=arr2[j++];
            }
        }
        //copy remaining elements
        while(i<n1) merged[k++] = arr1[i++];
        while(j<n2) merged[k++] = arr2[j++];
        // print result
        System.out.println("Merged array: ");
        for(int x: merged){
            System.out.println(x+ " ");
        }
        sc.close();

    }
    
}
