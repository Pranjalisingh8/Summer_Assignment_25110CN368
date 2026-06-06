/*WAP TO COUNT SET BITS IN A NUMBER*/
package Day6;
import java.util.Scanner;
public class Question23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");//taking input from user
        int number = sc.nextInt();//storing the input in a variable
        int count = 0;//initializing count variable to store the number of set bits
        while (number > 0) {//using while loop to count the set bits until the number becomes zero
            count += number & 1; // Increment count if the least significant bit is 1
            number >>= 1; // Right shift the bits of the number
        }
        System.out.println("Number of set bits: " + count);//printing the desired output
        sc.close();
    }
    
}
