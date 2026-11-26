import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Saves the student's progress to a text file called progress.txt
 * and loads it again the next time the program starts.
 *
 * The file looks like this:
 *   line 1: the subject (for example Python)
 *   line 2: the level (for example Beginner)
 *   each line after that: the name of one finished topic
 *
 * @author Ruyan Kumar
 */
public class ProgressManager {

    public static void save(Roadmap roadmap) {
        try {
            PrintWriter writer = new PrintWriter("progress.txt");
            writer.println(roadmap.getSubject());
            writer.println(roadmap.getLevel());
            for (Topic topic : roadmap.getTopics()) {
                if (topic.isCompleted()) {
                    writer.println(topic.getName());
                }
            }
            writer.close();
        } catch (FileNotFoundException e) {
            // If the file can't be written, warn the student but keep the program running.
            System.out.println("Sorry, your progress could not be saved.");
        }
    }

    public static Roadmap load() {
        try {
            Scanner fileScanner = new Scanner(new File("progress.txt"));

            // If the file is empty or broken, subject and level stay "" and
            // getRoadmap returns null, so the student simply starts fresh.
            String subject = "";
            String level = "";
            if (fileScanner.hasNextLine()) {
                subject = fileScanner.nextLine();
            }
            if (fileScanner.hasNextLine()) {
                level = fileScanner.nextLine();
            }

            Roadmap roadmap = RoadmapLibrary.getRoadmap(subject, level);
            if (roadmap != null) {
                // Every line after the first two is the name of a finished topic.
                while (fileScanner.hasNextLine()) {
                    roadmap.markCompletedByName(fileScanner.nextLine());
                }
            }

            fileScanner.close();
            return roadmap;
        } catch (FileNotFoundException e) {
            // There is no progress.txt yet (the first time using AIhelp), so start fresh.
            return null;
        }
    }
}