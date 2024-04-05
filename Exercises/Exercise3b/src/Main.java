import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;


public class Main {
    public static void serializeShapes(Shape[] shapes, String filename) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(shapes);
            System.out.println("Shapes have been serialized.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Shape[] deserializeShapes(String filename) {
        Shape[] shapes = null;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            shapes = (Shape[]) in.readObject();
            System.out.println("Shapes have been deserialized.");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return shapes;
    }

    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Rectangle(5, 10);
        shapes[1] = new Circle(7);
        shapes[2] = new Square(6);
        shapes[3] = new Triangle(1, 2, 3, 3, 3);

        serializeShapes(shapes, "shapes.ser");

        Shape[] deserializedShapes = deserializeShapes("shapes.ser");

        for (Shape shape : deserializedShapes) {
            System.out.println("--------------------------");
            System.out.println("Shape: " + shape.getName());
            System.out.println("Area: " + shape.calculateArea());
            System.out.println("Perimeter: " + shape.calculatePerimeter());
        }
    }
}