/**
 * Name: FIRST_NAME LAST_NAME
 * Course: CS-665 Software Designs & Patterns
 * Date: MM/DD/YYYY
 * File Name: Main.java
 * Description: Write a description for this class
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.example1.Person;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    /**
     * A main method to run examples.
     *
     * @param args not used
     */
    public static void main(String[] args) {
        /**
         * You may use this method for development purposes as you start building your
         * assignments/final project.  This could prove convenient to test as you are developing.
         * However, please note that every assignment/final projects requires JUnit tests.
         */

        // Let us create an object of the Main class.
        Main m = new Main();
        System.out.println("This is a test..");

        logger.info(m.doIt());

        logger.trace("Trace Message!");
        logger.debug("Debug Message!");
        logger.info("Info Message!");
        logger.warn("Warn Message!");
        logger.error("Error Message!");
        logger.fatal("Fatal Message!");
    }


    /**
     * This method performs XYZ and returns String.
     *
     * @return String
     */
    private String doIt() {
        Person student = new Person("John", "Doe");
        return student.getLastName() + ',' + student.getLastName();
    }

}
