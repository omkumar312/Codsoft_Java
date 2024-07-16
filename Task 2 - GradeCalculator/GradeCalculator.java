import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        int totalMarks = 0;

        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + i + ": ");
            int marks = scanner.nextInt();
            totalMarks += marks;
        }

        double percentage = (double) totalMarks / (numSubjects * 100) * 100;

        char grade;
        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("\n------------------------");
        System.out.println("     Grade Calculator      ");
        System.out.println("------------------------");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
        System.out.println("------------------------\n");
        System.out.print("Do you want to recalculate? (yes/no): ");
        String response = scanner.next();

        if (response.equals("yes")) {
            main(args);
        }
        else {
            System.out.println("\nThank you for using the Grade Calculator!");
        }

        scanner.close();
    }
}
