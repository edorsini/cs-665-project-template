
# CS-665 Java Project Template

This repository is a Java 25 Maven project template for CS-665 coursework. It provides a working build setup, example Java code, and test infrastructure for student assignments and small Java applications.

## Project overview

The project is organized around a simple educational example:

- `src/main/java/edu/bu/met/cs665/Main.java` runs a basic Log4j 2 example.
- `src/main/java/edu/bu/met/cs665/example1/Person.java` defines a `Person` model with names and age calculation.
- `src/test/java/edu/bu/met/cs665/TestAge.java` contains JUnit tests covering name accessors and birthday logic.

This template is designed to be easy to extend for assignments involving object modeling, unit testing, and software design patterns.

## Features included

- Java 25 Maven configuration with `maven.compiler.release` set to `25`
- Log4j 2 logging configuration in `src/main/resources/log4j2.xml`
- JUnit testing support
- JaCoCo coverage reports
- SpotBugs static analysis
- Checkstyle configuration under `config/`

## Prerequisites

Before building, install:

- Java 25 JDK
- Apache Maven 3.9 or newer

Check your environment with:

```bash
java -version
mvn -version
```

If Maven reports an older Java version, update `JAVA_HOME` and `PATH` so Maven uses JDK 25. For example on macOS:

```bash
export JAVA_HOME="$(/usr/libexec/java_home -v 25)"
export PATH="$JAVA_HOME/bin:$PATH"
mvn -version
```

## Build and run

Compile the project:

```bash
mvn clean compile
```

Run the unit tests:

```bash
mvn clean test
```

Generate coverage and build reports:

```bash
mvn clean verify
```

Run the sample application:

```bash
mvn exec:java
```

Launch the SpotBugs GUI:

```bash
mvn spotbugs:gui
```

Generate the Checkstyle report:

```bash
mvn checkstyle:checkstyle
```

## Useful reports

After running verification, inspect the generated reports in the `target/` directory:

- JaCoCo: `target/site/jacoco/index.html`
- Checkstyle HTML: `target/site/checkstyle.html`

## Notes

This project is a template, so it is meant to be adapted for a specific assignment or project. You can change the example classes, add new domain objects, and expand the tests as needed while keeping the Maven and Java configuration intact.
