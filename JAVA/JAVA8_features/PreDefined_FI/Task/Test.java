import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Array to hold students' scores
        int[][] scores = new int[numStudents][4];

        // Input scores for each student
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter scores for student " + (i + 1) + ":");
            for (int j = 0; j < 4; j++) {
                System.out.print("Score for subject " + (j + 1) + ": ");
                scores[i][j] = scanner.nextInt();
            }
        }

        // Calculate and display average score for each student
        System.out.println("\nAverage scores for each student:");
        for (int i = 0; i < numStudents; i++) {
            int total = 0;
            for (int j = 0; j < 4; j++) {
                total += scores[i][j];
            }
            double average = total / 4.0;
            System.out.printf("Student %d: Average score = %.2f%n", (i + 1), average);
        }

        scanner.close();
    }
}
