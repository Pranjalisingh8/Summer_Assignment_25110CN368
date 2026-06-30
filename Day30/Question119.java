/*WAP TO CREATE MINI EMPLOYEE MANAGEMENT SYSTEM */
package Day30;
import java.util.Scanner;
public class Question119 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id = 0, sal = 0, ch;

        do {
            System.out.println("1.Add 2.Show 3.Exit");
            ch = sc.nextInt();

            if(ch == 1) {
                System.out.print("ID: ");
                id = sc.nextInt();
                System.out.print("Salary: ");
                sal = sc.nextInt();
            }
            else if(ch == 2) {
                System.out.println(id + " " + sal);
            }
        } while(ch!= 3);
        sc.close();
    }
}

