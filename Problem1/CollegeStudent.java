package Problem1;

/**
 * The CollegeStudent class is a subclass of Student representing a college student in the school system.
 * It includes additional fields specific to college students.
 */

public class CollegeStudent extends Student {
    
    /**
     * The college student's major.
     */
    protected String myMajor;

    /**
     * The college student's year of study.
     */
    protected int myYear;

    /**
     * Constructs a new college student with the specified details.
     * @param name     The name of the college student.
     * @param age      The age of the college student.
     * @param gender   The gender of the college student.
     * @param idNum    The student ID number.
     * @param gpa      The grade point average of the college student.
     * @param major    The major of the college student.
     * @param year     The year of study of the college student.
     */
    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, String major, int year) {
        super(name, age, gender, idNum, gpa);
        myMajor = major;
        myYear = year;
    }

    /** Gets the major of the college student
     *
     * @return The college student's major
     */
    public String getMajor() {
        return myMajor;
    }

    /** Sets the major of the college student
     *
     * @param major The college student's new major
     */
    public void setMajor(String major) {
        myMajor = major;
    }

    /** Gets the year of study of the college student
     *
     * @return The college student's year of study
     */
    public int getYear() {
        return myYear;
    }

    /** Sets the year of study of the college student
     *
     * @param year The college student's new year of study
     */
    public void setYear(int year) {
        myYear = year;
    }

    /**
     * Returns a string representation of the college student, including all details.
     *
     * @return A string containing the college student's details
     */
    public String toString() {
        return super.toString() + ", Major: " + myMajor + ", Year: " + myYear;
    }

}
