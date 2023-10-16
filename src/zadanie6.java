import java.util.Scanner;

public class zadanie6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] testScores = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Podaj wynik testu " + (i + 1) + ": ");
            testScores[i] = scanner.nextInt();
        }
        double average = calcAverage(testScores);
        System.out.println("Średnia wyników: " + average);
        System.out.println("Oceny:");

        for (int i = 0; i < 5; i++) {
            char grade = determineGrade(testScores[i]);
            System.out.println("Test " + (i + 1) + ": " + testScores[i] + " - " + grade);
        }
    }

    public static double calcAverage(int[] scores) {
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return (double) sum / scores.length;
    }

    public static char determineGrade(int score) {
        if (score >= 90) {
            return '5';
        } else if (score >= 80) {
            return '4';
        } else if (score >= 70) {
            return '3';
        } else if (score >= 60) {
            return '2';
        } else {
            return '1';
        }
    }
}
