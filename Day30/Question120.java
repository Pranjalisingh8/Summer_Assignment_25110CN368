/*WAP TO DEVELOP COMPLETE MINI PROJECT USING ARRAYS,STRINGS AND FUNCTIONS */
package Day30;
import java.util.Scanner;
public class Question120 {
     // array for roll no and name
    static int r[] = new int[30];
    static String n[] = new String[30];
    static int count = 0; // to count students
    static Scanner sc = new Scanner(System.in);

    // function to add student
    static void add() {
        System.out.println("Enter roll no");
        r[count] = sc.nextInt();
        sc.nextLine(); // to consume newline
        System.out.println("Enter name");
        n[count] = sc.nextLine();
        count = count + 1; // increase count
        System.out.println("Student added");
    }

    // function to display
    static void display() {
        if(count == 0) {
            System.out.println("No student");
        }
        else {
            System.out.println("Roll No\tName");
            for(int i = 0; i < count; i++) {
                System.out.println(r[i] + "\t" + n[i]);
            }
        }
    }

    public static void main(String args[]) {
        int ch;

        do {
            System.out.println("1.Add Student");
            System.out.println("2.Display Student");
            System.out.println("3.Exit");
            System.out.println("Enter choice");
            ch = sc.nextInt();

            if(ch == 1) {
                add();
            }
            else if(ch == 2) {
                display();
            }
            else if(ch == 3) {
                System.out.println("Program end");
            }
            else {
                System.out.println("Wrong choice");
            }

        } while(ch!= 3);
    }
}
