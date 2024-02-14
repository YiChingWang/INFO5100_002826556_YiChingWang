public class Chair {
    private String id;
    private double height;
    private String material;
    private String color;
    private double weightCapacity;
    private boolean hasArmrests;
    private boolean isSwivel;
    private int wheels;

    public Chair(String id) {
        this.id = id;
        System.out.println("Chair instance created: " + id);
    }
    public void sit() {
        System.out.println("Sitting on the chair.");
    }
    public void move() {

        System.out.println("Moving the chair.");
    }
    public void adjustHeight() {

        System.out.println("Adjusting the chair's height.");
    }
}
