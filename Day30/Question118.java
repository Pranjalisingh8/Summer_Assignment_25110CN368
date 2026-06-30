/*WAP TO CREATE MINI LIBRARY SYSTEM */
package Day30;
import java.util.Scanner;
public class Question118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id[] = new int[10];
        String title[] = new String[10];
        String author[] = new String[10];
        int count = 0;
        int choice;

        do {
            System.out.println("\n=== Library ===");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();

            if(choice == 1) {
                if(count < 10) {
                    System.out.print("Enter ID: ");
                    id[count] = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Title: ");
                    title[count] = sc.nextLine();
                    System.out.print("Enter Author: ");
                    author[count] = sc.nextLine();
                    count++;
                    System.out.println("Book added!");
                } else {
                    System.out.println("Full!");
                }
            }
            else if(choice == 2) {
                if(count == 0) {
                    System.out.println("No books!");
                } else {
                    System.out.println("ID\tTitle\tAuthor");
                    for(int i = 0; i < count; i++) {
                        System.out.println(id[i] + "\t" + title[i] + "\t" + author[i]);
                    }
                }
            }
            else if(choice == 3) {
                System.out.println("THANK YOU!");
            }
            else {
                System.out.println("Wrong choice");
            }

        } while(choice!= 3);

        sc.close();
    }
}

