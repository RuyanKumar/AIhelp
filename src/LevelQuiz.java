import java.util.Scanner;

/**
 * A short yes or no quiz that suggests a level for students who are not sure.
 * Asking about things they have actually done is easier than guessing a level.
 *
 * @author Ruyan Kumar
 */
public class LevelQuiz {

    public static String suggestLevel(Scanner scanner, String subject) {
        System.out.println();
        System.out.println("Quick quiz! Answer y for yes or n for no.");

        int yesCount = 0;
        if (askYesNo(scanner, "Have you learned any " + subject + " before?")) {
            yesCount++;
        }
        if (askYesNo(scanner, "Can you write a loop and an if statement on your own?")) {
            yesCount++;
        }
        if (askYesNo(scanner, "Have you finished a small project in " + subject + "?")) {
            yesCount++;
        }

        // More yes answers means more experience.
        String level;
        if (yesCount <= 1) {
            level = "Beginner";
        } else if (yesCount == 2) {
            level = "Intermediate";
        } else {
            level = "Advanced";
        }

        System.out.println("You said yes " + yesCount + " times. Your level is: " + level);
        return level;
    }

    private static boolean askYesNo(Scanner scanner, String question) {
        while (true) {
            System.out.print(question + " (y/n): ");
            String answer = scanner.nextLine().trim().toLowerCase();
            if (answer.equals("y")) {
                return true;
            } else if (answer.equals("n")) {
                return false;
            }
            System.out.println("Please type y or n.");
        }
    }
}