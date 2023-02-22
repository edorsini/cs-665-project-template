/**
 * Name: FIRST_NAME LAST_NAME
 * Course: CS-665 Software Designs & Patterns
 * Date: MM/DD/YYYY
 * File Name: Person.java
 * Description: This class is responsible for the methods and attributes of a Person.
 */

package edu.bu.met.cs665.example1;

/**
 * This is the Person class.
 * This class is responsible for representing a Person.
 */
public class Person {

  private String firstName;
  private String lastName;

  /**
   * Create a Person object using first and last name and birthday.
   *
   * @param firstName firstname of the person as string
   * @param lastName  lastname of the person as string
   */
  public Person(String firstName, String lastName) {
    super();
    this.firstName = firstName;
    this.lastName = lastName;
  }

  /*
   * Getter method for first name.
   */
  public String getFirstName() {
    return firstName;
  }

  /**
   * Setter method for first name string.
   *
   * @param firstName first name of a person
   */
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * Getter method for Person's lastName.
   *
   * @return The last name of this Person.
   */
  public String getLastName() {
    return lastName;
  }

  /**
   * Setter method for Person's lastName.
   *
   * @param lastName The last name to assign to this person.
   */
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

}
