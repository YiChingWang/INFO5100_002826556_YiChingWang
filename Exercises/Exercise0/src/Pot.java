public class Pot {
    private String id;
    private String material;
    private double capacity;
    private String color;
    private boolean hasLid;
    private boolean isNonStick;
    private double weight;
    private String brand;

    public Pot(String id, String material, double capacity, String color, boolean hasLid, boolean isNonStick, double weight, String brand) {
        this.id = id;
        this.material = material;
        this.capacity = capacity;
        this.color = color;
        this.hasLid = hasLid;
        this.isNonStick = isNonStick;
        this.weight = weight;
        this.brand = brand;
        System.out.println("Pot instance " + this.id);
    }

    public void cook() {
        System.out.println("Cooking with the pot");
    }

    public void clean() {
        System.out.println("Cleaning the pot");
    }

    public void store() {
        System.out.println("Storing the pot");
    }

}
