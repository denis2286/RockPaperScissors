RockPaperScissors
=================

An Implementation of Rock, Paper, Scissors in Java.

The desktop application is played on the command line, with two games available, player v computer or computer v computer. For each mode, the user can choose the number of rounds to play the game over. 

Building
--------
The application is built using Maven:

`mvn package`

Running
-------
Once built, the application produces a jar file called RockPaperScissors.jar. To run the application, run the following from the command line.

`java -jar RockPaperScissors.jar`

Tests
-----
Like all good software applications, the source code has a suite of Unit Tests. These can be found in the src/test/java directory and can be run through maven:

`mvn test`