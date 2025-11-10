package Problem4;

/** Class representing a triangle shape.
 * Extends the abstract Shape class.
 */

public class Triangle extends Shape {
    
    /** The length of the first side of the triangle */
    protected double side1;
    /** The length of the second side of the triangle */
    protected double side2;
    /** The length of the third side of the triangle */
    protected double side3;

    /**
     * Constructor to initialize the triangle with a name and side lengths.
     * Validates that the provided sides can form a triangle.
     * @param name The name of the triangle.
     * @param side1 The length of the first side.
     * @param side2 The length of the second side.
     * @param side3 The length of the third side.
     */
    public Triangle(String name, double side1, double side2, double side3) {
        super(name);

        if (!(side1 + side2 > side3 && side2 + side3 > side1 && side3 + side1 > side2)) {
            System.err.println("ERROR: Invalid triangle sides provided.");
            System.exit(1);
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    /**
     * Sets the first side of the triangle.
     * Validates that the provided side can form a triangle.
     *
     * @param side1 The new length of the first side.
     */
    public void setSide1(double side1) {
        if (!(side1 + this.side2 > this.side3 && this.side2 + this.side3 > side1 && this.side3 + side1 > this.side2)) {
            System.err.println("ERROR: Invalid triangle side provided.");
            return;
        }
        this.side1 = side1;
    }

    /**
     * Gets the first side of the triangle.
     *
     * @return The length of the first side.
     */
    public double getSide1() {
        return side1;
    }

    /**
     * Sets the second side of the triangle.
     * Validates that the provided side can form a triangle.
     *
     * @param side2 The new length of the second side.
     */
    public void setSide2(double side2) {
        if (!(this.side1 + side2 > this.side3 && side2 + this.side3 > this.side1 && this.side3 + this.side1 > side2)) {
            System.err.println("ERROR: Invalid triangle side provided.");
            return;
        }
        this.side2 = side2;
    }

    /**
     * Gets the second side of the triangle.
     *
     * @return The length of the second side.
     */
    public double getSide2() {
        return side2;
    }

    /**
     * Sets the third side of the triangle.
     * Validates that the provided side can form a triangle.
     *
     * @param side3 The new length of the third side.
     */
    public void setSide3(double side3) {
        if (!(this.side1 + this.side2 > side3 && this.side2 + side3 > this.side1 && side3 + this.side1 > this.side2)) {
            System.err.println("ERROR: Invalid triangle side provided.");
            return;
        }
        this.side3 = side3;
    }

    /**
     * Gets the third side of the triangle.
     *
     * @return The length of the third side.
     */
    public double getSide3() {
        return side3;
    }

    /**
     * Calculates the area of the triangle.
     * Uses abstract method from Shape class.
     * @return The area of the triangle.
     */
    @Override
    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    /**
     * Calculates the perimeter of the triangle.
     * Uses abstract method from Shape class.
     * @return The perimeter of the triangle.
     */
    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    /**
     * Scales the triangle by a given factor.
     * Implements the Scalable interface method.
     * @param factor The scaling factor.
     */
    @Override
    public void scale(double factor) {
        side1 *= factor;
        side2 *= factor;
        side3 *= factor;
    }
    
}
