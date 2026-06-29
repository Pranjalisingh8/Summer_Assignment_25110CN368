package Day29;
import java.util.Scanner;
public class Question114 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        int n = 0;
        int choice;

        do {
            System.out.println("\n=== Array Menu ===");
            System.out.println("1. Enter Array");
            System.out.println("2. Display Array");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if(choice == 1) {
                System.out.print("Enter size: ");
                n = sc.nextInt();
                System.out.println("Enter " + n + " elements:");
                for(int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                }
            }
            else if(choice == 2) {
                if(n == 0) {
                    System.out.println("Array is empty!");
                } else {
                    System.out.print("Array: ");
                    for(int i = 0; i < n; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
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

