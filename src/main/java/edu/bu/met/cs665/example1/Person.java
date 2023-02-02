package edu.bu.met.cs665.example1;

/**
 * This Class represents a Person.
 * 
 * @author Kia
 *
 */
public class Person {


  /**
   * Create a Person object using first and last name and birthday.
   * 
   * @param firstName firstname of the person as string
   * @param lastName lastname of the person as string
   */
  public Person(String firstName, String lastName) {
    super();
    this.firstName = firstName;
    this.lastName = lastName;
  }

  private String firstName;
  private String lastName;


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
   * Getter method for last name of the person.
   * 
   * @return
   */
  public String getLastName() {
    return lastName;
  }

  /**
   * Setter method for the last name of the person.
   * 
   * @param lastName last name string
   */
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

}
