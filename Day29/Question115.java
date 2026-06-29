package Day29;
import java.util.Scanner;
public class Question115 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "";
        int choice;

        do {
            System.out.println("\n=== String Menu ===");
            System.out.println("1. Enter String");
            System.out.println("2. Display String");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            if(choice == 1) {
                System.out.print("Enter string: ");
                str = sc.nextLine();
            }
            else if(choice == 2) {
                if(str.equals("")) {
                    System.out.println("No string entered!");
                } else {
                    System.out.println("Your string: " + str);
                }
            }
            else if(choice == 3) {
                System.out.println("Bye!");
            }
            else {
                System.out.println("Wrong choice");
            }

        } while(choice!= 3);

        sc.close();
    }
}

