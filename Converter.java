import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter score: ");
            double score = scanner.nextDouble();

            double grade = 0.0;

            if (score >= 95.0) {
                grade = 4.0;
            } else if (score >= 94.0) {
                grade = 3.9;
            } else if (score >= 93.0) {
                grade = 3.8;
            } else if (score >= 92.0) {
                grade = 3.7;
            } else if (score >= 91.0) {
                grade = 3.6;
            } else if (score >= 90.0) {
                grade = 3.5;
            } else if (score >= 89.0) {
                grade = 3.4;
            } else if (score >= 88.0) {
                grade = 3.3;
            } else if (score >= 87.0) {
                grade = 3.2;
            } else if (score >= 86.0) {
                grade = 3.1;
            } else if (score >= 85.0) {
                grade = 3.0;
            } else if (score >= 84.0) {
                grade = 2.9;
            } else if (score >= 83.0) {
                grade = 2.8;
            } else if (score >= 82.0) {
                grade = 2.7;
            } else if (score >= 81.0) {
                grade = 2.6;
            } else if (score >= 80.0) {
                grade = 2.5;
            } else if (score >= 79.0) {
                grade = 2.4;
            } else if (score >= 78.0) {
                grade = 2.3;
            } else if (score >= 77.0) {
                grade = 2.2;
            } else if (score >= 76.0) {
                grade = 2.1;
            } else if (score >= 75.0) {
                grade = 2.0;
            } else if (score >= 74.0) {
                grade = 1.9;
            } else if (score >= 73.0) {
                grade = 1.8;
            } else if (score >= 72.0) {
                grade = 1.7;
            } else if (score >= 71.0) {
                grade = 1.6;
            } else if (score >= 70.0) {
                grade = 1.5;
            } else if (score >= 69.0) {
                grade = 1.4;
            } else if (score >= 68.0) {
                grade = 1.3;
            } else if (score >= 67.0) {
                grade = 1.2;
            } else if (score >= 66.0) {
                grade = 1.1;
            } else if (score >= 65.0) {
                grade = 1.0;
            } else {
                grade = 0.0; 
            }

            System.out.println("grade: " + grade);
        }
    }
}
