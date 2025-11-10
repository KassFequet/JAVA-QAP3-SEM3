package Problem2;

public class MovablePoint extends Point{

    /**
     * The x speed of the movable point
     */
    private float xSpeed = 0.0f;

    /**
     * The y speed of the movable point
     */
    private float ySpeed = 0.0f;


    /**
     * Constructs a MovablePoint with the specified x and y coordinates and speeds
     * @param x the x coordinate
     * @param y the y coordinate
     * @param xSpeed the x speed
     * @param ySpeed the y speed
     */
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    /**
     * Constructs a MovablePoint with the specified speeds at the default coordinates(0,0)
     * @param xSpeed the x speed
     * @param ySpeed the y speed
     */
    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    /**
     * Constructs a MovablePoint at the default coordinates (0,0) with zero speed
     */
    public MovablePoint() {
    }
    
    /**
     * Gets the x speed of the movable point
     * @return The x speed
     */
    public float getXSpeed() {
        return xSpeed;
    }

    /**
     * Sets the x speed of the movable point
     * @param xSpeed The new x speed
     */
    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    /**
     * Gets the y speed of the movable point
     * @return The y speed
     */
    public float getYSpeed() {
        return ySpeed;
    }

    /**
     * Sets the y speed of the movable point
     * @param ySpeed The new y speed
     */
    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    /**
     * Gets both the x and y speeds of the movable point
     * @return An array of the x speed and y speed
     */
    public float[] getSpeed() {
        return new float[] { xSpeed, ySpeed };
    }

    /**
     * Sets both the x and y speeds of the movable point
     * @param xSpeed The new x speed
     * @param ySpeed The new y speed
     */
    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    /**
     * Returns a string representation of the movable point
     * @return A string in the format "(x,y), speed=(xSpeed,ySpeed)"
     */
    @Override
    public String toString() {
        return (super.toString() + ", speed=(" + xSpeed + "," + ySpeed + ")");
    }

    /**
     * Moves the point by adding the speed to the current coordinates
     * @return The updated MovablePoint object
     */
    public MovablePoint move() {
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
        return this;
    }

}
