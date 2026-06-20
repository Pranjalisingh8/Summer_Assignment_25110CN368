/*WAP TO MULTIPLY MATRIX */
package Day20;
import java.util.Scanner;
public class Question77 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //First matrix 
        System.out.println( "Enter rows and columns of first matrix: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][]mat1 = new int[r1][c1];
        System.out.println("Enter the elements of first matrix: ");
        for(int i = 0; i<r1; i++){
            for(int j = 0; j<c1; j++){
                mat1[i][j] = sc.nextInt();

            }
        }
        //Second matrix
        System.out.println("Enter the rows and columns of second matrix: ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        if(c1!=r2){
            System.out.println("Matrix multiplication not possible.");/*Columns of first matrix must be equal to rows of second matrix */
            sc.close();
            }
            int[][]mat2 = new int[r2][c2];
            System.out.println("Enter elements of second matrix: ");
            for(int i = 0; i<r2; i++){
                for(int j =0; j<c2; j++){
                    mat2[i][j] = sc.nextInt();
                }
            }
            //Result matrix: r1*c2
            int[][] product = new int[r1][c2];
            //Multiplying matrices
            for (int i=0; i<r1; i++){
                for(int j = 0; j<c2; j++){
                    for(int k = 0; k<c1; k++){
                        product[i][j] += mat1[i][k] *mat2[k][j];
                    }
                }
            }
            System.out.println("Product of matrices: ");
            for(int i =0; i<r1; i++){
                for(int j = 0; j<c2; j++){
                    System.out.println(product[i][j]+ " ");
                }
                System.out.println();
            }
            sc.close();



    
}
}
