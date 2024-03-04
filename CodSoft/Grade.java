import java.util.Scanner;

public class Grade{
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

        System.out.println("Enter marks obtained (out of 100) in each subject:");
        int totalSubjects;
        do {
            System.out.print("Enter the total number of subjects: ");
            totalSubjects = scanner.nextInt();
        } while (totalSubjects <= 0);

        int[] marks = new int[totalSubjects];
        for (int i = 0; i < totalSubjects; i++) {
            System.out.print("Enter marks for Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        int totalMarks = calculateTotalMarks(marks);
        double averagePercentage = calculateAveragePercentage(totalMarks, totalSubjects);

        char grade = calculateGrade(averagePercentage);
        displayResults(totalMarks, averagePercentage, grade);
    }

    private static int calculateTotalMarks(int[] marks) {
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        return totalMarks;
    }

    private static double calculateAveragePercentage(int totalMarks, int totalSubjects) {
        return (double) totalMarks / totalSubjects;
    }

    private static char calculateGrade(double averagePercentage) {
        if (averagePercentage >= 90) {
            return 'A';
        } else if (averagePercentage >= 80) {
            return 'B';
        } else if (averagePercentage >= 70) {
            return 'C';
        } else if (averagePercentage >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    private static void displayResults(int totalMarks, double averagePercentage, char grade) {
        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);
    }
}
