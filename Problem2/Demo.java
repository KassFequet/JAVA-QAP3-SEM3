package Problem2;

public class Demo {

    /**
     * The Demo class is a test class for demonstrating the functionality of the
     * Point and MovablePoint classes.
     */

    public static void main(String[] args) {
        Point P1 = new Point(5.0f, 2.0f);
        System.out.println("\nPoint P1: " + P1.toString());

        Point P2 = new Point();
        System.out.println("\nPoint P2: " + P2.toString());

        MovablePoint MP1 = new MovablePoint(6.0f, 2.0f, 1.0f, 1.5f);
        System.out.println("\nMovable Point MP1: " + MP1.toString());

        MovablePoint MP2 = new MovablePoint(2.5f, 2.8f);
        System.out.println("\nMovable Point MP2: " + MP2.toString());

        MovablePoint MP3 = new MovablePoint();
        System.out.println("\nMovable Point MP3: " + MP3.toString());

        P1.setXY(3.5f, 2.5f);
        System.out.println("\nPoint P1 with new coordinates: " + P1.toString());

        MP1.setSpeed(9.0f, 5.0f);
        System.out.println("\nMovable Point MP1 with new speed: " + MP1.toString());

        MP1.move();
        System.out.println("\nMovable Point MP1 with new position: " + MP1.toString());

    }
    
}
