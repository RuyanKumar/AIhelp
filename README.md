# AIhelp

A Java program that gives you a learning plan for Python, Data Science, or AI.

## The Problem
Many students want to learn Python, Data Science, or AI. But they don't know where to start or what to use. AIhelp gives them a simple plan for their level.

## How It Works
![How AIhelp works](docs/how-it-works.png)
* **LevelQuiz.java:** asks 3 yes or no questions and suggests a level.

* **AIhelp.java:** the main menu. It checks what the user types.
* **RoadmapLibrary.java:** has all 9 learning plans.
* **Roadmap.java:** a list of topics. It shows your progress.
* **Topic.java:** one thing to learn and where to learn it.
* **ProgressManager.java:** saves and loads your progress.

## Tech Stack
* Java
* Scanner, ArrayList, and files
* IntelliJ IDEA and GitHub
* A text file called progress.txt

## How to Run It
You need Java 17 or newer and Git.

```
git clone https://github.com/RuyanKumar/AIhelp.git
cd AIhelp/src
javac *.java
java AIhelp
```

Type a number and press Enter.

### Example
```
What would you like to do?
1. Choose a learning path
2. View my roadmap
3. Mark a topic as complete
4. View my progress
5. Quit
Enter a number from 1 to 5: 4

Progress: 1 of 4 topics completed (25%)
Next up: Vectors and matrices: the math behind AI
```

## Roadmap
* [x] Choose what to learn
* [x] Choose your level
* [x] Get a learning plan
* [x] Mark topics as done
* [x] See your progress
* [x] Save your progress
* [x] Quiz to pick your level
* [ ] More subjects
* [ ] Progress charts
* [ ] Weekly goals

## Problems I Ran Into
* This project took a lot of time because some of the code was hard to think of.

## Demo
Video: coming soon