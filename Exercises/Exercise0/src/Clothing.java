public class Clothing {
    private String id;
    private String type;
    private String material;
    private String size;
    private String color;
    private String brand;
    private boolean isWashable;
    private String pattern;

    public Clothing(String id, String type, String material, String size, String color, String brand, boolean isWashable, String pattern) {
        this.id = id;
        this.type = type;
        this.material = material;
        this.size = size;
        this.color = color;
        this.brand = brand;
        this.isWashable = isWashable;
        this.pattern = pattern;
        System.out.println("Clothing instance created: " + this.id);
    }

    public void wear() {

        System.out.println("Wearing the clothing");
    }

    public void wash() {

        System.out.println("Washing the clothing");
    }

    public void fold() {

        System.out.println("Folding the clothing");
    }
}

