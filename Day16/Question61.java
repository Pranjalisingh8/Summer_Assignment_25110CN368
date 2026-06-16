/*WAP TO FIND MISSING NUMBER IN ARRAY */
package Day16;
import java.util.Scanner;
public class Question61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");//total  number should be 1 to n
        int n = sc.nextInt();
        int[]arr = new int[n-1];
        System.out.println("Enter "+(n-1)+ " elements from 1 to "+n+":");
        for (int i =0; i<n-1; i++){
            arr[i]= sc.nextInt();
        }
        int expectedSum = n*(n+1)/2;
        int actualSum=0;
        for(int i = 0; i<n-1; i++){
            actualSum += arr[i];
        }
        int missingNum = expectedSum - actualSum;
        System.out.println("Missing number: "+missingNum);

    sc.close();
}
}
   

    
    

        
    

