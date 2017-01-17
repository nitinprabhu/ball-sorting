# Getting started

* This project is implementation of Sorting problem mentioned in [Code Kata](http://codekata.com/kata/kata11-sorting-it-out/)
* It is developed using TDD approach.

# Prerequisites
* This project will require below software to execute
1. Apache Maven 3.3.9(This version is not specifically required).
2. JDK 1.7(If you need to change the JDK version please do change it in pom.xml also).
3. You need to set MAVEN_HOME and JAVA_HOME variable in your host environment variables where you need to run the program.
4. Also you need to set PATH variable of your host environment variable.

# Assumptions
* User will not enter any negative number.
* User will enter a number between 0 and 59.
* This project does not use any standard Java API to perform sorting and uses buble sort to perform sorting.

# Project build instructions
* Ensure prerequisites are fulfilled as mentioned above.
* Checkout the project using git repository URL [https://github.com/nitinprabhu/lotterysystem.git](https://github.com/nitinprabhu/lotterysystem.git)
* Execute command `mvn clean install` from command line.
* This command will download all dependencies from Maven Repository and you should be able to execute the test case.
