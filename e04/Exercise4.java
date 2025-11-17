/*
    Exercise 4
    Directory: w45/e04
    Objective:
        - Create a 2D array where each row represents a student and each column represents their test scores (5 tests). 
            Calculate and print the average score for each student.
    Expected Output:
        - For each student, print scores and average, e.g., "Student 1 scores: 70, 80, 90, 85, 75 | Average: 80".
*/

public class Exercise4 {
    public static void main(String[] args) {
        int[][] scores = {
            {70, 80, 90, 85, 75},
            {60, 75, 80, 70, 65},
            {90, 95, 85, 100, 90}
        };

        for (int i = 0; i < scores.length; i++) {
            int sum = 0;
            System.out.print("Student " + (i + 1) + " scores: ");
            for (int j = 0; j < scores[i].length; j++) {
                sum += scores[i][j];
                System.out.print(scores[i][j]);
                if (j < scores[i].length - 1) {
                    System.out.print(", ");
                }
            }
            double average = (double) sum / scores[i].length;
            System.out.println(" | Average: " + average);
        }  
    }
}