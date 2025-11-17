/*
    Exercise 7
    Directory: w45/e07
    Objective:
        - Create a 2D array where rows represent days of the week and columns 
            represent temperature readings for different times of the day. 
            Calculate and print the average temperature for each day.
        - Use Math.random() to generate the temperature values
    Expected Output:
        - For each day, print the average temperature, e.g., "Monday average temperature: 22.5".
*/

public class Exercise7 {
    public static void main(String[] args) {
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int times = 4;
        double[][] temperatures = new double[days.length][times];

        for (int i = 0; i < days.length; i++) {
            for (int j = 0; j < times; j++) {
                temperatures[i][j] = 15 + Math.random() * 15;
            }
        }

        for (int i = 0; i < days.length; i++) {
            double sum = 0;
            System.out.print(days[i] + " temperatures: ");
            for (int j = 0; j < times; j++) {
                sum += temperatures[i][j];
                System.out.print(String.format("%.1f", temperatures[i][j]));
                if (j < times - 1) System.out.print(", ");
            }
            double average = sum / times;
            System.out.println(" | Average: " + String.format("%.1f", average));
        }
    }
}