public class Bed {
    private String id;
    private String size;
    private String material;
    private String color;
    private double length;
    private double width;
    private double height;
    private boolean hasHeadboard;
    private boolean hasFootboard;

    public Bed(String id, String size, String material, String color, double length, double width, double height, boolean hasHeadboard, boolean hasFootboard) {
        this.id = id;
        this.size = size;
        this.material = material;
        this.color = color;
        this.length = length;
        this.width = width;
        this.height = height;
        this.hasHeadboard = hasHeadboard;
        this.hasFootboard = hasFootboard;
        System.out.println("Bed instance " + this.id);
    }

    public void make() {

        System.out.println("Making the bed");
    }

    public void sleep() {

        System.out.println("Sleeping in the bed");
    }

    public void changeSheets() {

        System.out.println("Changing the bed sheets");
    }
}

