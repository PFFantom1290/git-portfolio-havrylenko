Calories and Macros


This is a Java tool to track your daily food and macros.


How to build and run
Build: mvn clean install


Test: mvn test


Run: You can run the Main class in IntelliJ.


Build Tool
I chose Maven because it is easy to manage tools like Gson and JUnit in one file.


Run tests using mvn test


The conflicting file was src/main/java/com/tracker/Main.java.
The conflict occurred because the dailyGoal variable was modified at the same time on both the master branch and the feature/real-conflict branch.

To resolve it, I manually edited the file, removed the Git conflict markers, and set the final value of dailyGoal to 2500.