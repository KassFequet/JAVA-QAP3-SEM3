package Problem1;

/**
 * The Person class is a base class representing a person in school system.
 * It provides common fields and methods for subclasses such as Student and Teacher.
 */

public class Person {

    /**
     * The name of the person.
     */
    protected String myName;
    /**
     * The age of the person.
     */
    protected int myAge;
    /**
     * The gender of the person.
     * Either "M" for Male or "F" for Female.
     */
    protected String myGender;

    /**
     * Constructs a new person with the specified details.
     * @param name     The name of the person.
     * @param age      The age of the person.
     * @param gender   The gender of the person.
     */
    public Person(String name, int age, String gender) {
        myName = name;
        myAge = age;
        myGender = gender;
    }

    /** Gets the name of the person
     *
     * @return The persons name
     */
    public String getName() {
        return myName;
    }

    /** Sets the name of the person
     *
     * @param name The person's new name
     */
    public void setName(String name) {
        myName = name;
    }

    /** Gets the age of the person
     *
     * @return The person's age
     */
    public int getAge() {
        return myAge;
    }

    /** Sets the age of the person
     *
     * @param age The person's new age
     */
    public void setAge(int age) {
        myAge = age;
    }

    /** Gets the gender of the person
     *
     * @return The person's gender
     */
    public String getGender() {
        return myGender;
    }

    /** Sets the gender of the person
     *
     * @param gender The person's new gender
     */
    public void setGender(String gender) {
        myGender = gender;
    }

    /** Returns a string representation of the person, including name, age and gender
     *
     * @return A string containing the person's details.
     */
    public String toString() {
        return ("\n" + myName + ", Age: " + myAge + ", Gender: " + myGender);
    }

}

