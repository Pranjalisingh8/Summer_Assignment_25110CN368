/*WAP TO CREATE A STUDENT RECORD SYSTEM USING ARRAYS AND STRINGS */
package Day30;
import java.util.Scanner;
public class Question117 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int roll[] = new int[5];
        String name[] = new String[5];
        int marks[] = new int[5];
        int count = 0;
        int choice;

        while(true) {
            System.out.println("\n=== Student Record ===");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();

            if(choice == 1) {
                if(count < 5) {
                    System.out.print("Enter Roll: ");
                    roll[count] = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    name[count] = sc.nextLine();
                    System.out.print("Enter Marks: ");
                    marks[count] = sc.nextInt();
                    count++;
                    System.out.println("Added!");
                } else {
                    System.out.println("Full!");
                }
            }
            else if(choice == 2) {
                if(count == 0) {
                    System.out.println("No records!");
                } else {
                    System.out.println("Roll\tName\tMarks");
                    for(int i = 0; i < count; i++) {
                        System.out.println(roll[i] + "\t" + name[i] + "\t" + marks[i]);
                    }
                }
            }
            else if(choice == 3) {
                System.out.println("Bye!");
                break;
            }
            else {
                System.out.println("Wrong choice");
            }
        }

        sc.close();
    }
}
    
                
    

