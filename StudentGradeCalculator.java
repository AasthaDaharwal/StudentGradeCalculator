package StudentGradeCalculator;

import java.util.*;

public class StudentGradeCalculator {

    public static String getStudentName(Scanner sc) {
        System.out.print("Enter Student name: ");
        return sc.nextLine();
    }

    public static int getNumberOfSubjects (Scanner sc) {
        System.out.println("Enter name of subjects");
        return sc.nextInt();
    }

    public static int[] getMarks(Scanner sc, int n) {
        int[] marks = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks for Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
        return marks;
    }

    public static int calculateTotal(int[] marks) {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    public static double calculatePercentage(int total, int numberOfSubjects) {
        return (double) total / numberOfSubjects;
    }

    public static String calculateGrade(double percentage) {
        if (percentage >= 90) return "A+";
        else if (percentage >= 80) return "A";
        else if (percentage >= 70) return "B";
        else if (percentage >= 60) return "C";
        else if (percentage >= 50) return "D";
        else return "F";
    }

    public static void displayResult(String name, int total, int maxMarks, double percentage, String grade) {
        System.out.println("\n----- Student Report -----");
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + total + "/" + maxMarks);
        System.out.printf("Percentage: %.2f%%\n", percentage);
        System.out.println("Grade: " + grade);
    }

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        String name = getStudentName(sc);
        int numberOfSubjects = getNumberOfSubjects(sc);
        int[] marks = getMarks(sc, numberOfSubjects);
        int total = calculateTotal(marks);
        double percentage = calculatePercentage(total, numberOfSubjects);
        String grade = calculateGrade(percentage);
        int maxMarks = numberOfSubjects * 100;

        displayResult(name, total, maxMarks, percentage, grade);

        sc.close();
    }
    
}
