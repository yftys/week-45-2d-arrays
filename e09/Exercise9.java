/*
    Exercise 9
    Directory: w45/e09
    Objective:
        - Create a 2D array representing a simulation grid for simple life forms, 
            where 1 is an alive cell and 0 is a dead cell. 
        - Implement the rules of Conway’s Game of Life and simulate it for 6 iterations.
        - https://simple.wikipedia.org/wiki/Conway%27s_Game_of_Life
    Expected Output: 
        - Print the grid after each iteration, showing how cells evolve based on the rules.
*/

public class Exercise9 {
    public static void main(String[] args) {
        int rows = 5;
        int cols = 5;
        int[][] grid = new int[rows][cols];
        int iterations = 6;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                grid[i][j] = Math.random() < 0.3 ? 1 : 0;
            }
        }

        for (int iter = 1; iter <= iterations; iter++) {
            System.out.println("Iteration " + iter + ":");
            printGrid(grid);
            grid = nextGeneration(grid);
        }
    }

    public static int[][] nextGeneration(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int[][] newGrid = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int liveNeighbors = 0;
                for (int r = i - 1; r <= i + 1; r++) {
                    for (int c = j - 1; c <= j + 1; c++) {
                        if (r == i && c == j) continue;
                        if (r >= 0 && r < rows && c >= 0 && c < cols) {
                            liveNeighbors += grid[r][c];
                        }
                    }
                }
                if (grid[i][j] == 1) {
                    newGrid[i][j] = (liveNeighbors == 2 || liveNeighbors == 3) ? 1 : 0;
                } else {
                    newGrid[i][j] = (liveNeighbors == 3) ? 1 : 0;
                }
            }
        }
        return newGrid;
    }

    public static void printGrid(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}