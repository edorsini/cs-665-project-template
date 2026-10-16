/**
 * Name: FIRST_NAME LAST_NAME
 * Course: CS-665 Software Designs & Patterns
 * Date: MM/DD/YYYY
 * File Name: Person.java
 * Description: This class is responsible for the methods and attributes of a Person.
 */

package edu.bu.met.cs665.example1;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

/**
 * This is the Person class.
 * This class is responsible for representing a Person.
 */
public class Person {

  private String firstName;
  private String lastName;
  private final LocalDate birthday;

  /**
   * Create a Person object using first and last name.
   *
   * @param firstName firstname of the person as string
   * @param lastName  lastname of the person as string
   */
  public Person(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.birthday = null;
  }

  /**
   * Create a Person object using first name, last name, and birthday.
   *
   * @param firstName firstname of the person as string
   * @param lastName  lastname of the person as string
   * @param birthday  date of birth
   */
  public Person(String firstName, String lastName, LocalDate birthday) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.birthday = Objects.requireNonNull(birthday, "birthday");
  }

  /**
   * Get this person's age as of today.
   *
   * @return the person's age in whole years
   */
  public int getAge() {
    return getAge(LocalDate.now());
  }

  /**
   * Get this person's age as of a specified date.
   *
   * @param asOfDate date on which to calculate the person's age
   * @return the person's age in whole years
   */
  public int getAge(LocalDate asOfDate) {
    Objects.requireNonNull(asOfDate, "asOfDate");
    if (birthday == null) {
      throw new IllegalStateException("Cannot calculate age without a birthday.");
    }
    if (asOfDate.isBefore(birthday)) {
      throw new IllegalArgumentException(
          "The date of age calculation cannot precede the birthday.");
    }
    return Period.between(birthday, asOfDate).getYears();
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
