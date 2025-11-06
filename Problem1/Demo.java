package Problem1;

/**
 * The Demo class is a test class for demonstrating the functionality of the
 * Person, Student, Teacher and CollegeStudent classes.
 */

public class Demo {

    public static void main(String[] args) {

        Person Mary = new Person("Mary Lewis", 23, "F");
        System.out.println(Mary);

        Student Maurice = new Student("Maurice Shattler", 35, "M", "S100", 3.5);
        System.out.println(Maurice);

        Teacher mrsWoodland = new Teacher ("Mrs. Susan Woodland", 48, "F", "Chemistry", 60000.00);
        System.out.println(mrsWoodland);

        CollegeStudent Dillon = new CollegeStudent("Dillon Fequet", 26, "M", "CS100", 3.8, "Sociology", 2);
        System.out.println(Dillon + "\n");

    }

}
