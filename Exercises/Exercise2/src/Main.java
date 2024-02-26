public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Rectangle(5, 10);
        shapes[1] = new Circle(7);
        shapes[2] = new Square(6);
        shapes[3] = new Triangle(1,2,3,3,3);

        for (Shape shape : shapes) {
            System.out.println("--------------------------");
            System.out.println("Shape: " + shape.getName());
            System.out.println("Area: " + shape.calculateArea());
            System.out.println("Perimeter: " + shape.calculatePerimeter());
        }
        System.out.println("--------------------------");
        System.out.println("Color of shapes: " + Shape.color);
    }
}