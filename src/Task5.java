import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] scores = new int[5];
        int passed = 0;
        int failed = 0;
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            System.out.print("Enter score " + (i + 1) + ": ");
            int input = scanner.nextInt();
            while (input < 0 || input > 100) {
                System.out.print("Invalid score. Enter a number from 0 to 100: ");
                input = scanner.nextInt();
            }
            scores[i] = input;
        }
        for (int score : scores) {
            sum += score;
            if (score >= 60) {
                passed++;
            } else {
                failed++;
            }
        }
        double average = (double) sum / scores.length;
        System.out.print("Scores: ");
        for (int score : scores) {
            System.out.print(score + " ");
        }
        System.out.println();
        System.out.println("Passed: " + passed);
        System.out.println("Failed: " + failed);
        System.out.println("Average: " + average);
    }
}