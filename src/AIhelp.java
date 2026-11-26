import java.util.Scanner;

/**
 * AIhelp helps students plan what to learn in Python, Data Science, and AI.
 * The student picks a subject and a level, gets a step-by-step roadmap with free
 * resources, and marks topics complete as they go.
 *
 * This class runs the main menu.
 *
 * @author Ruyan Kumar
 */
public class AIhelp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to AIhelp!");
        System.out.println("Your personal learning roadmap planner.");

        Roadmap roadmap = null;
        boolean running = true;

        while (running) {
            System.out.println();
            System.out.println("What would you like to do?");
            System.out.println("1. Choose a learning path");
            System.out.println("2. View my roadmap");
            System.out.println("3. Mark a topic as complete");
            System.out.println("4. View my progress");
            System.out.println("5. Quit");
            int choice = readNumber(scanner, 1, 5);

            if (choice == 1) {
                String subject = chooseSubject(scanner);
                String level = chooseLevel(scanner);
                roadmap = RoadmapLibrary.getRoadmap(subject, level);
                roadmap.printRoadmap();
            } else if (choice == 5) {
                System.out.println("Goodbye! Keep learning.");
                running = false;
            } else if (roadmap == null) {
                // Options 2, 3 and 4 all need a roadmap, so this one check covers all three.
                System.out.println("You have not picked a learning path yet. Choose option 1 first.");
            } else if (choice == 2) {
                roadmap.printRoadmap();
            } else {
                System.out.println("Coming soon!");
            }
        }

        scanner.close();
    }

    /**
     * Keeps asking until the user types a whole number from min to max.
     *
     * @param scanner reads what the user types
     * @param min     the smallest number allowed
     * @param max     the largest number allowed
     * @return a number from min to max
     */
    private static int readNumber(Scanner scanner, int min, int max) {
        while (true) {
            System.out.print("Enter a number from " + min + " to " + max + ": ");
            String input = scanner.nextLine();
            try {
                int number = Integer.parseInt(input.trim());
                if (number >= min && number <= max) {
                    return number;
                }
            } catch (NumberFormatException e) {
                // The user typed something that is not a number, like "abc" or nothing.
                // Instead of crashing, we fall through and ask again.
            }
            System.out.println("That is not a valid choice. Please try again.");
        }
    }

    private static String chooseSubject(Scanner scanner) {
        System.out.println();
        System.out.println("What do you want to learn?");
        System.out.println("1. Python");
        System.out.println("2. Data Science");
        System.out.println("3. AI");
        int choice = readNumber(scanner, 1, 3);

        if (choice == 1) {
            return "Python";
        } else if (choice == 2) {
            return "Data Science";
        } else {
            return "AI";
        }
    }

    private static String chooseLevel(Scanner scanner) {
        System.out.println();
        System.out.println("What is your experience level?");
        System.out.println("1. Beginner");
        System.out.println("2. Intermediate");
        System.out.println("3. Advanced");
        int choice = readNumber(scanner, 1, 3);

        if (choice == 1) {
            return "Beginner";
        } else if (choice == 2) {
            return "Intermediate";
        } else {
            return "Advanced";
        }
    }
}