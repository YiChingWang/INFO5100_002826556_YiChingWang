import java.io.Serializable;
public abstract class Shape implements Serializable {
    public static String color = "Yellow";
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
    public abstract String getName();
}