import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Saves the student's progress to a text file called progress.txt.
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
}