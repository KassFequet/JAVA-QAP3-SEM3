package Problem1;

/**
 * The Student class is a subclass of Person representing a student in the school system.
 * It includes additional fields specific to students.
 */

public class Student extends Person {

    /**
     * The student ID number.
     */
    protected String myIdNum;

    /**
     * The grade point average of the student.
     */
    protected double myGPA;

    /**
     * Constructs a new student with the specified details.
     * @param name     The name of the student.
     * @param age      The age of the student.
     * @param gender   The gender of the student.
     * @param idNum    The student ID number.
     * @param gpa      The grade point average of the student.
     */
    public Student(String name, int age, String gender, String idNum, double gpa) {
        super(name, age, gender);
        myIdNum = idNum;
        myGPA = gpa;
    }

    /** Gets the student ID number
     *
     * @return The student's ID number
     */
    public String getIdNum() {
        return myIdNum;
    }

    /** Sets the student ID number
     *
     * @param idNum The student's new ID number
     */
    public void setIdNum(String idNum) {
        myIdNum = idNum;
    }

    /** Gets the grade point average of the student
     *
     * @return The student's GPA
     */
    public double getGPA() {
        return myGPA;
    }

    /** Sets the grade point average of the student
     *
     * @param gpa The student's new GPA
     */
    public void setGPA(double gpa) {
        myGPA = gpa;
    }

    /** Returns a string representation of the student, including all details
     *
     * @return A string containing the student's details
     */
    public String toString() {
        return super.toString() + ", ID Number: " + myIdNum + ", GPA: " + myGPA;
    }

}
