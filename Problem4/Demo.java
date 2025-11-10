package Problem4;

public class Demo {

    /**
     * Main method to demonstrate scaling of shapes.
     */
    public static void main(String[] args) {
        Scalable[] shapes = new Scalable[4];
        shapes[0] = new Ellipse("Ellipse", 15, 12);
        shapes[1] = new Circle("Circle", 7);
        shapes[2] = new Triangle("Triangle", 8, 10, 12);
        shapes[3] = new EquilateralTriangle("Equilateral Triangle", 13);

        System.out.println("\n| Shapes before scaling |");
        for (Scalable shape : shapes) {
            System.out.println(shape.toString());
        }

        double scaleFactor = 5.0;
        scaleShapes(shapes, scaleFactor);

        System.out.println("\n| Shapes after scaling by " + scaleFactor + " |");
        for (Scalable shape : shapes) {
            System.out.println(shape.toString());
        }
    }

    /**
     * Static method to scale an array of Scalable objects.
     *
     * @param shapes      The array of Scalable objects.
     * @param scaleFactor The scaling factor.
     */
    public static void scaleShapes(Scalable[] shapes, double scaleFactor) {
        for (Scalable shape : shapes) {
            shape.scale(scaleFactor);
        }
    }
    
}
