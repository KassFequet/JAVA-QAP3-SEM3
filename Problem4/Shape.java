package Problem4;

/** Abstract class representing a generic shape. */

public abstract class Shape implements Scalable {

    /** The name of the shape. */
    protected String name;

    /**
     * Constructor to initialize the shape with a name.
     * @param name The name of the shape.
     */
    public Shape(String name) {
        this.name = name;
    }

    /**
     * Gets the name of the shape.
     * @return The name of the shape.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the shape.
     * @param name The new name of the shape.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Calculates the area of the shape.
     * @return The area of the shape.
     */
    public abstract double getArea();

    /**
     * Calculates the perimeter of the shape.
     * @return The perimeter of the shape.
     */
    public abstract double getPerimeter();

    @Override
    public String toString() {
        return ("\nName: " + name + " | Area: " + getArea() + " | Perimeter: " + getPerimeter());
    }
}
