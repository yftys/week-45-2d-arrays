/*
    Exercise 5
    Directory: w45/e05
    Objective:
        - Create a 2D array representing a matrix and write a program to transpose it (swap rows and columns).
    Expected Output:
        - Print the original and transposed matrix. 
        - Use Math.random() to generate the values
*/

public class Exercise5 {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 4;
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }

        System.out.println("Original matrix:");
        printMatrix(matrix);

        int[][] transposed = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }

        System.out.println("\nTransposed matrix:");
        printMatrix(transposed);
    }

    public static void printMatrix(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }  
    }
}