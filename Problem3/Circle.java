package Problem3;

/**
 * Class representing a circle shape.
 * Extends the abstract Shape class.
 */

public class Circle extends Shape {

    /** The radius of the circle */
    protected double radius;

    /** Constructor to initialize the circle with a name and radius.
     * @param name The name of the circle.
     * @param radius The radius of the circle.
     */
    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    /** Gets the radius of the circle.
     * @return The radius of the circle.
     */
    public double getRadius() {
        return radius;
    }

    /** Sets the radius of the circle.
     * @param radius The new radius of the circle.
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Calculates the area of the circle.
     * Uses the Shape abstract method.
     * @return The area of the circle.
     */
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    /**
     * Calculates the perimeter of the circle.
     * Uses the Shape abstract method.
     * @return The perimeter of the circle.
     */
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    
}
