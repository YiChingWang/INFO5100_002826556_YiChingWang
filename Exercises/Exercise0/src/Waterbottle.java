public class Waterbottle {
    private String id;
    private String material;
    private double capacity;
    private String color;
    private boolean isInsulated;
    private double weight;
    private String brand;
    private boolean hasStraw;

    public Waterbottle(String id, String material, double capacity, String color, boolean isInsulated, double weight, String brand, boolean hasStraw) {
        this.id = id;
        this.material = material;
        this.capacity = capacity;
        this.color = color;
        this.isInsulated = isInsulated;
        this.weight = weight;
        this.brand = brand;
        this.hasStraw = hasStraw;
        System.out.println("WaterBottle instance created: " + this.id);
    }

    public void fill() {
        System.out.println("Filling the water bottle");
    }

    public void drink() {
        System.out.println("Drinking from the water bottle");
    }

    public void clean() {
        System.out.println("Cleaning the water bottle");
    }

}

