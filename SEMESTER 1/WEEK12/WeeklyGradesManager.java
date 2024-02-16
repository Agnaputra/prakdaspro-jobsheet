package WEEK12;
import java.util.Scanner;

public class WeeklyGradesManager {

    // Function to input students' grade data
    public static void inputGrades(int[][] grades, int numStudents, int numWeeks, Scanner scanner) {
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter grades for student " + (i + 1) + ":");
            for (int j = 0; j < numWeeks; j++) {
                System.out.print("Week " + (j + 1) + ": ");
                grades[i][j] = scanner.nextInt();
            }
        }
    }

    // Function to display all student grades from the first week to the seventh week
    public static void displayAllGrades(int[][] grades, int numStudents, int numWeeks) {
        System.out.println("\nAll Student Grades:");
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            for (int j = 0; j < numWeeks; j++) {
                System.out.print(grades[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Function to find the week that has the highest grade from all students
    public static int findHighestWeek(int[][] grades, int numStudents, int numWeeks) {
        int highestWeek = 0;
        int maxGrade = 0;

        for (int j = 0; j < numWeeks; j++) {
            int totalGrade = 0;
            for (int i = 0; i < numStudents; i++) {
                totalGrade += grades[i][j];
            }

            if (totalGrade > maxGrade) {
                maxGrade = totalGrade;
                highestWeek = j;
            }
        }

        return highestWeek;
    }

    // Function to find the student with the highest grade
    public static void findStudentWithHighestGrade(int[][] grades, int numStudents, int numWeeks) {
        int highestStudent = 0;
        int maxGrade = 0;

        for (int i = 0; i < numStudents; i++) {
            int totalGrade = 0;
            for (int j = 0; j < numWeeks; j++) {
                totalGrade += grades[i][j];
            }

            if (totalGrade > maxGrade) {
                maxGrade = totalGrade;
                highestStudent = i;
            }
        }

        System.out.println("Student with the highest grade is Student " + (highestStudent + 1) +
                " with a total grade of " + maxGrade);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of students and weeks
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        System.out.print("Enter the number of weeks: ");
        int numWeeks = scanner.nextInt();

        // Create a 2D array to store grades
        int[][] grades = new int[numStudents][numWeeks];
        // Input students' grades
        inputGrades(grades, numStudents, numWeeks, scanner);
        // Display all student grades
        displayAllGrades(grades, numStudents, numWeeks);
        // Find the week with the highest grade from all students
        int highestWeek = findHighestWeek(grades, numStudents, numWeeks);
        System.out.println("Week with the highest grade from all students: Week " + (highestWeek + 1));
        // Find the student with the highest grade
        findStudentWithHighestGrade(grades, numStudents, numWeeks);

        scanner.close();
  }
  
}
    

