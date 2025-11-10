package Problem3;

public class Demo {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Ellipse("Ellipse", 15, 12);
        shapes[1] = new Circle("Circle", 7);
        shapes[2] = new Triangle("Triangle", 8, 10, 12);
        shapes[3] = new EquilateralTriangle("Equilateral Triangle", 13);

        for (Shape shape : shapes) {
            System.out.println(shape.toString());
        }
    }
    
}
