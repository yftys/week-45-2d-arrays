/*
    Exercise 6 
    Directory: w45/e06
    Objective:
        - Create a 3x3 2D array with random integer values and find the maximum element in each row.
    Expected Output:
        - For each row, print the maximum value, e.g., "Max in row 1: 9".
        - Use Math.random() to generate the values
*/

public class Exercise6 {
    public static void main(String[] args) {
       int rows = 3;
        int cols = 3;
        int[][] array = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = (int) (Math.random() * 10);
            }
        }

        for (int i = 0; i < rows; i++) {
            int max = array[i][0];
            for (int j = 1; j < cols; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
            System.out.print("Row " + (i + 1) + ": ");
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("| Max: " + max);
        }
    }
}