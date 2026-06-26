package Day26;
import java.util.Scanner;
public class Question104 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;

        System.out.println("=== Simple Quiz ===");

        // Q1
        System.out.println("\n1. Capital of India?");
        System.out.println("A) Mumbai  B) Delhi  C) Kolkata");
        System.out.print("Answer: ");
        char q1 = sc.next().charAt(0);
        if (q1 == 'B' || q1 == 'b') {
            score = score + 1;
            System.out.println("Correct");
        } else {
            System.out.println("Wrong");
        }

        // Q2
        System.out.println("\n2. 5 + 3 = ?");
        System.out.println("A) 6  B) 7  C) 8");
        System.out.print("Answer: ");
        char q2 = sc.next().charAt(0);
        if (q2 == 'C' || q2 == 'c') {
            score = score + 1;
            System.out.println("Correct");
        } else {
            System.out.println("Wrong");
        }

        // Q3
        System.out.println("\n3. Java is a ___ language?");
        System.out.println("A) Programming  B) Cooking  C) Speaking");
        System.out.print("Answer: ");
        char q3 = sc.next().charAt(0);
        if (q3 == 'A' || q3 == 'a') {
            score = score + 1;
            System.out.println("Correct");
        } else {
            System.out.println("Wrong");
        }

        // Final Score
        System.out.println("\nQuiz Over!");
        System.out.println("Your Score: " + score + "/3");

        sc.close();
    }
}
    

