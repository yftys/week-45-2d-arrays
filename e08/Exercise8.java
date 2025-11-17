/*
    Exercise 8
    Directory: w45/e08
    Objective:
        - Create a 3x3 2D array to represent a Tic-Tac-Toe board. 
        - Populate it with 'X', 'O', or empty strings, then print the board.
        - X's, O's and empty spaces must be randomly chosen. (use Math.random())
    Expected Output:
        - Display the board layout.
*/

public class Exercise8 {
    public static void main(String[] args) {
         char[][] board = new char[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                double rand = Math.random();
                if (rand < 0.33) board[i][j] = 'X';
                else if (rand < 0.66) board[i][j] = 'O';
                else board[i][j] = ' ';
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
                if (j < 2) System.out.print(" | ");
            }
            System.out.println();
            if (i < 2) System.out.println("--+---+--");
        }  
    }
}