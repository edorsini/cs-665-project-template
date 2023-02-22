/**
 * Name: FIRST_NAME LAST_NAME
 * Course: CS-665 Software Designs & Patterns
 * Date: MM/DD/YYYY
 * File Name: Main.java
 * Description: Write a description for this class
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.example1.Person;

/**
 * This is the Main class.
 */
public class Main {

  /**
   * A main method to run examples.
   * You may use this method for development purposes as you start building your
   * assignments/final project.  This could prove convenient to test as you are developing.
   * However, please note that every assignment/final projects requires JUnit tests.
   */
  public static void main(String[] args) {
    System.out.println("This is a test message from the Main class (Main.java file)");
  }

  /**
   * This method performs XYZ and returns String.
   *
   * @return String
   */
  private String doIt() {
    Person student = new Person("John", "Doe");
    return student.getLastName() + ',' + student.getFirstName();
  }

}
