public class Table {
    private String id;
    private double length;
    private double width;
    private double height;
    private String material;
    private int legsCount;
    private double weightCapacity;
    private String color;

    public Table(String id) {
        this.id = id;
        System.out.println("Table instance created: " + id);
    }
    public void clean() {
        System.out.println("Cleaning the table.");
    }
    public void move() {
        System.out.println("Moving the table.");
    }
    public void assemble() {
        System.out.println("Assembling the table.");
    }

}
