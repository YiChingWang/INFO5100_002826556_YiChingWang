public class Room {
    private String id;
    private double length;
    private double width;
    private double height;
    private int windows;
    private String color;
    private boolean hasCloset;
    private int doors;

    public Room(String id) {
        this.id = id;
        System.out.println("Room instance created: " + id);
    }

    public void cleanRoom() {
        System.out.println("Cleaning the room."); }
    public void paint() {
        System.out.println("Painting the room."); }
    public void rearrangeFurniture() {
        System.out.println("Rearranging the furniture in the room."); }

    // 嵌套类1：燈（Light）
    public class Light {
        private String type;
        private boolean isLed;
        private int lumens;
        private boolean isDimmable;
        private String color;

        public Light(String type) {
            this.type = type;
            System.out.println("Light instance created: " + type);
        }

        public void turnOn() {
            System.out.println("Turning on the light."); }
        public void turnOff() {
            System.out.println("Turning off the light."); }
        public void adjustBrightness() {
            System.out.println("Adjusting the light's brightness."); }
    }

    // 嵌套类2：衣櫃（Closet）
    public class Closet {
        private double width;
        private double height;
        private double depth;
        private String material;
        private int shelves;
        private int hangingRods;
        private boolean hasDoors;
        private String color;

        public Closet() {
            System.out.println("Closet instance created.");
        }

        public void open() {
            System.out.println("Opening the closet."); }
        public void close() {
            System.out.println("Closing the closet."); }
        public void organizeClothes() {
            System.out.println("Organizing clothes in the closet."); }
    }
}
