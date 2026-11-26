/**
 * One thing a student needs to learn, plus a free place to learn it.
 *
 *
 * @author Ruyan Kumar
 */
public class Topic {
    private String name;
    private String resource;
    private boolean completed;

    public Topic(String name, String resource) {
        this.name = name;
        this.resource = resource;
        this.completed = false;
    }

    public String getName() {
        return name;
    }

    public String getResource() {
        return resource;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void markCompleted() {
        completed = true;
    }

    @Override
    public String toString() {
        String checkbox = "[ ]";
        if (completed) {
            checkbox = "[X]";
        }
        // The resource goes on its own indented line so long names stay easy to read.
        return checkbox + " " + name + "\n       Resource: " + resource;
    }
}