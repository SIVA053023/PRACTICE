import java.util.*;

public class Two {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter tyhe number of students :");

        int numstudents = scanner.nextInt();
        ;

        int[][] scores = new int[numstudents][4];

        for (int i = 0; i < numstudents; i++) {
            System.out.println("Enter the score of Student :" + i + 1 + ":");
            for (int j = 0; j < 4; j++) {
                System.out.println("Scores for subject" + j + 1 + ":");
                scores[i][j] = scanner.nextInt();

            }
        }
        System.out.println("Average of the each student :");
        for(int i=0;i<numstudents;i++){
                int total=0;
                for(int j=0;j<4;j++){
                    total +=scores[i][j];
                }
                double Average= total/4.0;
                System.out.println("Avarage of student" + i+1+Average);
        }
        scanner.close();
    }
}
