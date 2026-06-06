/*WAP TO CONVERT DECIMAL TO BINARY */
package Day6;
import java.util.Scanner;
public class Question21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number:");//taking input from user
        int decimal = sc.nextInt();//store the input in variable decimal
        String binary = "";//initialising an empty string to store the binary representation
        while (decimal > 0) {//using while loop to convert decimal to binary until the decimal becomes zero
            int remainder = decimal % 2;//finding the remainder when decimal is divided by 2
            binary = remainder + binary;
            decimal /= 2;
        }
        System.out.println("Binary representation: " + binary);
        sc.close();
    }
    
}
