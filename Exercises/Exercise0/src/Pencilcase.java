public class Pencilcase {
    private String id;
    private String material;
    private String color;
    private double length;
    private double width;
    private double height;
    private int compartmentCount;
    private boolean isZippered;
    private String brand;

    public Pencilcase(String id, String material, String color, double length, double width, double height, int compartmentCount, boolean isZippered, String brand) {
        this.id = id;
        this.material = material;
        this.color = color;
        this.length = length;
        this.width = width;
        this.height = height;
        this.compartmentCount = compartmentCount;
        this.isZippered = isZippered;
        this.brand = brand;
        System.out.println("PencilCase instance " + this.id);
    }

    public void open() {
        System.out.println("Opening the pencil case");
    }

    public void close() {
        System.out.println("Closing the pencil case");
    }

    public void organize() {
        System.out.println("Organizing the pencil case");
    }

}

