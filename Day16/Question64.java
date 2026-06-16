/*WAP TO REMOVE DUPLICATES FROM AN ARRAY */
package Day16;
import java.util.Scanner;
public class Question64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Remove duplicates
        int[] uniqueArr = removeDuplicates(arr);
        // Print the array without duplicates
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < uniqueArr.length; i++) {
            System.out.print(uniqueArr[i] + " ");
            sc.close();
        }
    }

    public static int[] removeDuplicates(int[] arr) {
        if (arr == null || arr.length == 0) {
            return arr;
        }
        java.util.HashSet<Integer> set = new java.util.HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        int[] uniqueArr = new int[set.size()];
        int index = 0;
        for (int num : set) {
            uniqueArr[index++] = num;
        }
        return uniqueArr;
        
    }
}
