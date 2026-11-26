/**
 * AIhelp helps students plan what to learn in Python, Data Science, and AI.
 *
 *
 * @author Ruyan Kumar
 */
public class AIhelp {

    public static void main(String[] args) {
        System.out.println("Welcome to AIhelp!");

        // Temporary: always show one roadmap to check that my three classes work together.
        // The menu replaces this in Step 8.
        Roadmap roadmap = RoadmapLibrary.getRoadmap("Python", "Beginner");
        roadmap.printRoadmap();
    }
}