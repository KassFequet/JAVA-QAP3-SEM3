package Problem1;

/**
 * The Teacher class is a subclass of Person representing a teacher in the school system.
 * It can include additional fields specific to teachers.
 */

public class Teacher extends Person {
    
    /**
     * The subject taught by the teacher.
     */
    protected String mySubject;

    /**
     * The salary of the teacher.
     */
    protected double mySalary;

    /**
     * Constructs a new teacher with the specified details.
     * @param name     The name of the teacher.
     * @param age      The age of the teacher.
     * @param gender   The gender of the teacher.
     * @param subject  The subject taught by the teacher.
     * @param salary   The salary of the teacher.
     */
    public Teacher(String name, int age, String gender, String subject, double salary) {
        super(name, age, gender);
        mySubject = subject;
        mySalary = salary;
    }

    /** Gets the subject taught by the teacher
     *
     * @return The subject taught by the teacher
     */
    public String getSubject() {
        return mySubject;
    }

    /** Sets the subject taught by the teacher
     *
     * @param subject The new subject taught by the teacher
     */
    public void setSubject(String subject) {
        mySubject = subject;
    }

    /** Gets the salary of the teacher
     *
     * @return The teacher's salary
     */
    public double getSalary() {
        return mySalary;
    }

    /** Sets the salary of the teacher
     *
     * @param salary The teacher's new salary
     */
    public void setSalary(double salary) {
        mySalary = salary;
    }

    /** A string representation of the teacher, including all details.
     *
     * @return A string containing all teacher details.
     */
    public String toString() {
        return (super.toString() + ", Subject: " + mySubject + ", Salary: " + mySalary);
    }

}
