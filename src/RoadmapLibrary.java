/**
 * Every learning roadmap AIhelp knows about.
 *
 * The roadmaps are written straight into the code instead of being read from a file.
 *
 *
 * @author Ruyan Kumar
 */
public class RoadmapLibrary {
    public static final String[] SUBJECTS = {"Python", "Data Science", "AI"};
    public static final String[] LEVELS = {"Beginner", "Intermediate", "Advanced"};

    /**
     * Builds the roadmap for one subject and level.
     *
     * @param subject one of the values in SUBJECTS
     * @param level   one of the values in LEVELS
     * @return the matching roadmap, or null if the subject or level is unknown.
     *         Returning null (instead of crashing) lets ProgressManager recover
     *         from a progress.txt file that someone edited by hand.
     */
    public static Roadmap getRoadmap(String subject, String level) {
        Roadmap roadmap = new Roadmap(subject, level);

        if (subject.equals("Python") && level.equals("Beginner")) {
            roadmap.addTopic("Install Python and write your first program",
                    "Official Python Tutorial, sections 1-3 (docs.python.org/3/tutorial)");
            roadmap.addTopic("Variables, data types, and user input",
                    "CS50P Lecture 0: Functions, Variables (cs50.harvard.edu/python)");
            roadmap.addTopic("If statements and loops",
                    "CS50P Lectures 1 and 2: Conditionals, Loops");
            roadmap.addTopic("Lists, dictionaries, and functions",
                    "Official Python Tutorial, sections 4 and 5");

        } else if (subject.equals("Python") && level.equals("Intermediate")) {
            roadmap.addTopic("Handling errors with try/except",
                    "CS50P Lecture 3: Exceptions");
            roadmap.addTopic("Using libraries and pip",
                    "CS50P Lecture 4: Libraries");
            roadmap.addTopic("Reading and writing files",
                    "CS50P Lecture 6: File I/O");
            roadmap.addTopic("Classes and objects",
                    "CS50P Lecture 8: Object-Oriented Programming");

        } else if (subject.equals("Python") && level.equals("Advanced")) {
            roadmap.addTopic("Testing your code with unit tests",
                    "CS50P Lecture 5: Unit Tests");
            roadmap.addTopic("Regular expressions",
                    "CS50P Lecture 7: Regular Expressions");
            roadmap.addTopic("Getting data from web APIs as JSON",
                    "Requests library quickstart (requests.readthedocs.io)");
            roadmap.addTopic("Writing clean code and sharing it on GitHub",
                    "PEP 8 style guide (peps.python.org/pep-0008) and GitHub Docs (docs.github.com)");

        } else {
            return null;
        }

        return roadmap;
    }
}