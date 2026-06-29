package Day29;
import java.util.Scanner;
public class Question116 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id[] = new int[10];
        String name[] = new String[10];
        int qty[] = new int[10];
        int count = 0;
        int choice;

        do {
            System.out.println("\n=== Inventory ===");
            System.out.println("1. Add Item");
            System.out.println("2. Display Items");
            System.out.println("3. Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();

            if(choice == 1) {
                if(count < 10) {
                    System.out.print("Enter ID: ");
                    id[count] = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    name[count] = sc.nextLine();
                    System.out.print("Enter Qty: ");
                    qty[count] = sc.nextInt();
                    count++;
                    System.out.println("Item added!");
                } else {
                    System.out.println("Full!");
                }
            }
            else if(choice == 2) {
                if(count == 0) {
                    System.out.println("Empty inventory!");
                } else {
                    System.out.println("ID\tName\tQty");
                    for(int i = 0; i < count; i++) {
                        System.out.println(id[i] + "\t" + name[i] + "\t" + qty[i]);
                    }
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

