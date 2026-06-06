/*WAP TO CONVERT BINARY TO DECIMAL */
package Day6;
import java.util.Scanner;
public class Question22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary number:");//taking input from user
        String binary = sc.nextLine();//store the input in variable binary
        int decimal = 0;//initialising a variable to store the decimal representation
        int length = binary.length();//finding the length of the binary number
        for (int i = 0; i < length; i++) {//using for loop to convert binary to decimal
            char bit = binary.charAt(length - 1 - i);//getting each bit from the binary number starting from the rightmost bit
            if (bit == '1') {
                decimal += Math.pow(2, i);//if the bit is 1, adding the value of 2 raised to the power of i to the decimal variable
            }
        }
        System.out.println("Decimal representation: " + decimal);
        sc.close();
    }
    
}
