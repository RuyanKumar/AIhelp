/**
 * Every learning roadmap AIhelp knows about.
 *
 * The roadmaps are written straight into the code instead of being read from a file.
 *
 *
 * @author Ruyan Kumar
 */
public class RoadmapLibrary {

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

        } else if (subject.equals("Data Science") && level.equals("Beginner")) {
            roadmap.addTopic("Set up a notebook to write code in",
                    "Google Colab (colab.research.google.com) or Kaggle Notebooks");
            roadmap.addTopic("Basic statistics: mean, median, and spread",
                    "Khan Academy: Statistics and Probability (khanacademy.org)");
            roadmap.addTopic("Working with tables of data in pandas",
                    "Kaggle Learn: Pandas (kaggle.com/learn)");
            roadmap.addTopic("Making charts from data",
                    "Kaggle Learn: Data Visualization");

        } else if (subject.equals("Data Science") && level.equals("Intermediate")) {
            roadmap.addTopic("Cleaning messy data",
                    "Kaggle Learn: Data Cleaning");
            roadmap.addTopic("Asking questions of a database with SQL",
                    "Kaggle Learn: Intro to SQL");
            roadmap.addTopic("Statistics for data science",
                    "OpenIntro Statistics, free textbook (openintro.org)");
            roadmap.addTopic("Explore a real dataset on your own",
                    "Kaggle Datasets (kaggle.com/datasets)");

        } else if (subject.equals("Data Science") && level.equals("Advanced")) {
            roadmap.addTopic("Build your first machine learning model",
                    "Kaggle Learn: Intro to Machine Learning");
            roadmap.addTopic("Feature engineering",
                    "Kaggle Learn: Feature Engineering");
            roadmap.addTopic("Testing how good a model is",
                    "scikit-learn User Guide (scikit-learn.org)");
            roadmap.addTopic("Enter a beginner Kaggle competition",
                    "Kaggle 'Titanic' Getting Started competition");

        } else if (subject.equals("AI") && level.equals("Beginner")) {
            roadmap.addTopic("What AI and machine learning are",
                    "Elements of AI, free online course (elementsofai.com)");
            roadmap.addTopic("Vectors and matrices: the math behind AI",
                    "3Blue1Brown: Essence of Linear Algebra (YouTube)");
            roadmap.addTopic("How a machine learning model learns",
                    "Kaggle Learn: Intro to Machine Learning");
            roadmap.addTopic("Using AI responsibly",
                    "Kaggle Learn: Intro to AI Ethics");

        } else if (subject.equals("AI") && level.equals("Intermediate")) {
            roadmap.addTopic("How neural networks work",
                    "3Blue1Brown: Neural Networks series (YouTube)");
            roadmap.addTopic("Machine learning foundations",
                    "Andrew Ng's Machine Learning Specialization (DeepLearning.AI)");
            roadmap.addTopic("Build a neural network in code",
                    "Kaggle Learn: Intro to Deep Learning");
            roadmap.addTopic("Deep learning with PyTorch",
                    "PyTorch Tutorials: Learn the Basics (pytorch.org/tutorials)");

        } else if (subject.equals("AI") && level.equals("Advanced")) {
            roadmap.addTopic("Practical deep learning projects",
                    "fast.ai: Practical Deep Learning for Coders (course.fast.ai)");
            roadmap.addTopic("Transformers and large language models",
                    "Hugging Face courses (huggingface.co/learn)");
            roadmap.addTopic("Build a small app that uses an AI model",
                    "Your own idea, using models from huggingface.co");
            roadmap.addTopic("Read research papers and join a research project",
                    "arXiv (arxiv.org) and your university's undergraduate research office");
        } else {
            return null;
        }

        return roadmap;
    }
}