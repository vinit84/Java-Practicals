package practical.pkg2;
import java.util.Scanner;

public class Practical2 {
    public static void main(String[] args) {
        int[][] matrix;
        int rows, columns;
        System.out.println("Enter the number of rows and columns");
        Scanner scanner = new Scanner(System.in);
        rows = scanner.nextInt();
        columns = scanner.nextInt();
        matrix = new int[rows][columns];
        System.out.println("Enter the values of matrix A");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter the values of matrix B");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                matrix[i][j] += scanner.nextInt();
            }
        }
        System.out.println("Addition of both the Matrix");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }   
}