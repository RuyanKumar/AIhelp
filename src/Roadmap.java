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

    public int countCompleted() {
        int count = 0;
        for (Topic topic : topics) {
            if (topic.isCompleted()) {
                count++;
            }
        }
        return count;
    }

    /**
     * Topics are stored in study order, so the first unfinished one is what to do next.
     *
     * @return the next topic to study, or null if every topic is done
     */
    public Topic getNextTopic() {
        for (Topic topic : topics) {
            if (!topic.isCompleted()) {
                return topic;
            }
        }
        return null;
    }

    public void printProgress() {
        int done = countCompleted();
        int total = topics.size();
        // Multiply before dividing. With int math 1 / 4 is 0, so done / total * 100
        // would show 0% until the very last topic.
        int percent = done * 100 / total;

        System.out.println();
        System.out.println("Progress: " + done + " of " + total + " topics completed (" + percent + "%)");

        Topic next = getNextTopic();
        if (next == null) {
            System.out.println("You finished this roadmap! Try the next level.");
        } else {
            System.out.println("Next up: " + next.getName());
            System.out.println("Start here: " + next.getResource());
        }
    }
}