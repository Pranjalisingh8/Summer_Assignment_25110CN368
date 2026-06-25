/*WAP TO SORT NAMES ALPHABETICALLY */
package Day25;
import java.util.Scanner;
import java.util.Arrays;
public class Question99 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of names: ");
        int n = sc.nextInt();
        sc.nextLine(); //consume new line
        String[] names = new String[n];
        System.out.println("Enter "+n+" names:");
        for(int i = 0; i<n; i++){
            names[i]=sc.nextLine();
        }
        //sort alphabetically
        Arrays.sort(names);
        System.out.println(" Nmes in alphabetical order: ");
        for(String name : names){
            System.out.println(name);
        }
        sc.close();
    }
    
}
