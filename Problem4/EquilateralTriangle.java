package Problem4;

/** Class representing an equilateral triangle shape.
 * Extends the abstract Shape class.
 */

public class EquilateralTriangle extends Shape {
    
    /** The length of the side of the equilateral triangle */
    private double side;

    /** Constructor to initialize the equilateral triangle with a name and side length.
     * @param name The name of the equilateral triangle.
     * @param side The length of the side.
     */
    public EquilateralTriangle(String name, double side) {
        super(name);
        this.side = side;
    }

    /** Gets the length of the side of the equilateral triangle.
     * @return The length of the side.
     */
    public double getSide() {
        return side;
    }

    /** Sets the length of the side of the equilateral triangle.
     * @param side The new length of the side.
     */
    public void setSide(double side) {
        this.side = side;
    }

    /**
     * Calculates the area of the equilateral triangle.
     * Uses the Shape abstract method.
     * @return The area of the equilateral triangle.
     */
    @Override
    public double getArea() {
        return (Math.sqrt(3) / 4) * side * side;
    }

    /**
     * Calculates the perimeter of the equilateral triangle.
     * Uses the Shape abstract method.
     * @return The perimeter of the equilateral triangle.
     */
    @Override
    public double getPerimeter() {
        return 3 * side;
    }

    /**
     * Scales the equilateral triangle by a given factor.
     * Implements the Scalable interface method.
     * @param factor The scaling factor.
     */
    @Override
    public void scale(double factor) {
        side *= factor;
    }
}