package Problem2;

public class Point {

    /**
     * The x coordinate of the point
     */
    private float x = 0.0f;

    /**
     * The y coordinate of the point
     */
    private float y = 0.0f;
    

    /**
     * Constructs a Point with the specified x and y coordinates
     * @param x the x coordinate
     * @param y the y coordinate
     */
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Constructs a Point with default coordinates (0,0)
     */
    public Point() {}

    /** Gets the x coordinate of the point
     *
     * @return The x coordinate
     */
    public float getX() {
        return x;
    }

    /**
     * Sets the x coordinate of the point
     * @param x The new x coordinate
     */
    public void setX(float x) {
        this.x = x;
    }

    /** Gets the y coordinate of the point
     *
     * @return The y coordinate
     */
    public float getY() {
        return y;
    }

    /**
     * Sets the y coordinate of the point
     * @param y The new y coordinate
     */
    public void setY(float y) {
        this.y = y;
    }

    /** Gets both the x and y coordinates of the point
     *
     * @return An array of the x and y coordinates
     */
    public float[] getXY() {
        return new float[] { x, y };
    }

    /**
     * Sets both the x and y coordinates of the point
     *
     * @param x The new x coordinate
     * @param y The new y coordinate
     */
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Returns a string representation of the point in the format (x, y)
     *
     * @return A string representing the point
     */
    @Override
    public String toString() {
        return "\n(" + x + ", " + y + ")";
    }

}
