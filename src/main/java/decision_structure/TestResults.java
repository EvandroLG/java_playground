package decision_structure;

import java.util.Scanner;

public class TestResults {
    public static void main(String[] args) {
        System.out.println("Enter your letter grade");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        String message = switch (grade) {
            case "A" -> "Excelente job!";
            case "B" -> "Great job!";
            case "C" -> "Good job!";
            default -> "You can do better!";
        };

        System.out.println(message);
    }
}
