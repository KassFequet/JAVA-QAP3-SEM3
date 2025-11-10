package Problem3;

/** Class representing an ellipse shape.
 * Extends the abstract Shape class.
 */

public class Ellipse extends Shape {
    /** The major axis of the ellipse */
    protected double a;
    
    /** The minor axis of the ellipse */
    protected double b;

    /**
     * Constructor to initialize the ellipse with a name, major axis, and minor axis.
     * Validation is performed to ensure a is major axis and b is minor axis.
     * @param name The name of the ellipse.
     * @param a The length of the major axis.
     * @param b The length of the minor axis.
     */
    public Ellipse(String name, double a, double b) {
        super(name);
        this.a = Math.max(a, b);
        this.b = Math.min(a, b);
    }
    
    /**
     * Gets the major axis of the ellipse.
     * @return The major axis.
     */
    public double getA() {
        return a;
    }

    /**
     * Sets the major axis of the ellipse.
     * Validation is performed to ensure a is always the major axis.
     * @param a The new major axis.
     */
    public void setA(double a) {
        this.a = Math.max(a, this.b);
        this.b = Math.min(a, this.b);
    }

    /**
     * Gets the minor axis of the ellipse.
     * @return The minor axis.
     */
    public double getB() {
        return b;
    }

    /**
     * Sets the minor axis of the ellipse.
     * Validation is performed to ensure b is always the minor axis.
     * @param b The new minor axis.
     */
    public void setB(double b) {
        this.a = Math.max(this.a, b);
        this.b = Math.min(this.a, b);
    }
    
    /**
     * Calculates the Area of the ellipse using the Shape class's abstract method.
     * @return The area of the ellipse.
     */
    @Override
    public double getArea() {

        return Math.PI * a * b;
    }

    /**
     * Calculates the Perimeter of the ellipse the Shape class's abstract method.
     * @return The perimeter of the ellipse.
     */
    @Override
    public double getPerimeter() {
        double P = Math.pow((a - b), 2) / Math.pow((a + b), 2);
        return Math.PI * (a + b) * (1 + (3 * P) / (10 + Math.sqrt(4 - 3 * P)));
    }
    

}