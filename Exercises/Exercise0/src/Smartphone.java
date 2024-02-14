public class Smartphone {
    private String id;
    private String brand;
    private String model;
    private double screenSize;
    private int storage;
    private int ram;
    private String os;
    private double batteryCapacity;

    public Smartphone(String id, String brand) {
        this.id = id;
        this.brand = brand;
        System.out.println("Smartphone instance created: " + id);
    }

    public void makeCall() {
        System.out.println("Making a call.");
    }
    public void sendText() {
        System.out.println("Sending a text message.");
    }
    public void browseInternet() {
        System.out.println("Browsing the internet.");
    }

}
