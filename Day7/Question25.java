/*WAP TO RECURSIVE FACTORIAL */
package Day7;
import java.util.Scanner;
public class Question25 {
 
int factorial(int n){
        if (n==0||n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);//recursive call
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");//taking input from user
        int num = sc.nextInt();
       Question25 obj = new Question25();//create object to call
        if (num<0){
            System.out.println("Factorial does not exist.");
        }
        else{
            int result = obj.factorial(num);
            System.out.println("Factorial of" + num + "is: "+result );
        }
        sc.close();
    
}
}
