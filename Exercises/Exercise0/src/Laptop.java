public class Laptop {
    private String id;
    private String brand;
    private String model;
    private double screenSize;
    private int storage;
    private int ram;
    private double weight;
    private double batteryLife;

    public Laptop(String id, String brand) {
        this.id = id;
        this.brand = brand;
        System.out.println("Laptop instance created: " + id);
    }
    public void powerOn() {

        System.out.println("Powering on the laptop.");
    }
    public void powerOff() {

        System.out.println("Shutting down the laptop.");
    }
    public void displaySpecs() {

        System.out.println("Displaying laptop specs.");
    }
}

