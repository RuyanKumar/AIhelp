import java.util.ArrayList;

/**
 * An ordered list of topics for one subject at one level, like "Python - Beginner".
 *
 *
 * @author Ruyan Kumar
 */
public class Roadmap {
    private String subject;
    private String level;
    private ArrayList<Topic> topics;

    public Roadmap(String subject, String level) {
        this.subject = subject;
        this.level = level;
        // ArrayList instead of an array because roadmaps can have any number of topics.
        this.topics = new ArrayList<>();
    }

    public String getSubject() {
        return subject;
    }

    public String getLevel() {
        return level;
    }

    public ArrayList<Topic> getTopics() {
        return topics;
    }

    public void addTopic(String name, String resource) {
        topics.add(new Topic(name, resource));
    }

    public void printRoadmap() {
        System.out.println();
        System.out.println("=== Your " + subject + " Roadmap (" + level + ") ===");
        for (int i = 0; i < topics.size(); i++) {
            // Number from 1, not 0, because students type these numbers into the menu.
            System.out.println((i + 1) + ". " + topics.get(i));
        }
    }
}