package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import java.time.LocalDate;
import org.junit.Test;
import edu.bu.met.cs665.example1.Person;

/**
 * Write some Unit tests for your program like the examples below.
 */

public class TestAge {

    public TestAge() {
    }

    @Test
    public void testGetFirstName() {

        Person student = new Person("John", "Doe");
        assertEquals("John", student.getFirstName());

    }


    @Test
    public void testSetFirstName() {
        // Given: a student object with the following first name and last name
        Person student = new Person("John", "Doe");

        // When: the student's first name is changed via the following setter method
        student.setFirstName("Bob");

        // Then: we confirm the expected result is the same as the value obtained from
        // the getter method
        assertEquals("Bob", student.getFirstName());
    }


    @Test
    public void testGetLastName() {

        Person student = new Person("John", "Doe");
        assertEquals("Doe", student.getLastName());

    }


    @Test
    public void testSetLastName() {

        Person student = new Person("John", "Doe");
        student.setLastName("Henrink");

        assertEquals("Henrink", student.getLastName());

    }


    @Test
    public void testPerson() {

        Person student = new Person("John", "Doe");
        assertEquals("John", student.getFirstName());
        assertEquals("Doe", student.getLastName());
    }

    @Test
    public void testAgeBeforeBirthday() {
        Person person = new Person("Jane", "Doe", LocalDate.of(1990, 10, 17));

        assertEquals(29, person.getAge(LocalDate.of(2020, 10, 16)));
    }

    @Test
    public void testAgeOnBirthday() {
        Person person = new Person("Jane", "Doe", LocalDate.of(1990, 10, 17));

        assertEquals(30, person.getAge(LocalDate.of(2020, 10, 17)));
    }

    @Test
    public void testAgeAfterBirthday() {
        Person person = new Person("Jane", "Doe", LocalDate.of(1990, 10, 17));

        assertEquals(30, person.getAge(LocalDate.of(2020, 10, 18)));
    }

    @Test
    public void testCannotCalculateAgeWithoutBirthday() {
        Person person = new Person("Jane", "Doe");

        assertThrows(IllegalStateException.class, () -> person.getAge(LocalDate.of(2020, 10, 18)));
    }

    @Test
    public void testCannotCalculateAgeBeforeBirth() {
        Person person = new Person("Jane", "Doe", LocalDate.of(1990, 10, 17));

        assertThrows(IllegalArgumentException.class, () -> person.getAge(LocalDate.of(1990, 10, 16)));
    }

}
