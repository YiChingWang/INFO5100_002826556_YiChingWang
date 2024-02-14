public class Main {
    public static void main(String[] args) {
        // Creating instances of the Bed class
        Bed bed1 = new Bed("1", "Queen", "Wood", "White", 80.0, 60.0, 40.0, true, true);
        Bed bed2 = new Bed("2", "King", "Metal", "Black", 85.0, 70.0, 42.0, false, false);
        Bed bed3 = new Bed("3", "Single", "Wood", "Natural", 75.0, 55.0, 38.0, true, false);

        // Creating instances of the Chair class
        Chair chair1 = new Chair("C1");
        Chair chair2 = new Chair("C2");
        Chair chair3 = new Chair("C3");

        // Creating instances of the Clothing class
        Clothing clothing1 = new Clothing("1", "T-Shirt", "Cotton", "Medium", "Blue", "BrandA", true, "Solid");
        Clothing clothing2 = new Clothing("2", "Jeans", "Denim", "Large", "Black", "BrandB", true, "None");
        Clothing clothing3 = new Clothing("3", "Jacket", "Leather", "Small", "Brown", "BrandC", false, "None");

        // Creating instances of the Laptop class
        Laptop laptop1 = new Laptop("1", "Apple");
        Laptop laptop2 = new Laptop("2", "Dell");
        Laptop laptop3 = new Laptop("3", "Lenovo");

        // Creating instances of the Pencilcase class
        Pencilcase pencilcase1 = new Pencilcase("1", "Plastic", "Blue", 10.0, 5.0, 2.5, 5, true, "BrandA");
        Pencilcase pencilcase2 = new Pencilcase("2", "Fabric", "Red", 8.0, 4.5, 3.0, 3, false, "BrandB");
        Pencilcase pencilcase3 = new Pencilcase("3", "Metal", "Black", 9.0, 6.0, 2.0, 4, true, "BrandC");

        // Creating instances of the Pot class
        Pot pot1 = new Pot("1", "Stainless Steel", 5.0, "Silver", true, true, 2.5, "BrandA");
        Pot pot2 = new Pot("2", "Aluminum", 3.5, "Black", true, false, 1.8, "BrandB");
        Pot pot3 = new Pot("3", "Copper", 4.0, "Brown", false, true, 2.0, "BrandC");

        // Instantiate at least 3 objects of each class
        Smartphone smartphone1 = new Smartphone("1", "Samsung");
        Smartphone smartphone2 = new Smartphone("2", "Apple");
        Smartphone smartphone3 = new Smartphone("3", "Google");

        // Instantiate at least 3 objects of each class
        Table table1 = new Table("1");
        Table table2 = new Table("2");
        Table table3 = new Table("3");

        // Instantiate at least 3 objects of each class
        Waterbottle waterbottle1 = new Waterbottle("1", "Plastic", 500, "Blue", true, 0.2, "XYZ", true);
        Waterbottle waterbottle2 = new Waterbottle("2", "Stainless Steel", 750, "Silver", true, 0.4, "ABC", false);
        Waterbottle waterbottle3 = new Waterbottle("3", "Glass", 1000, "Clear", false, 0.5, "PQR", true);

        // Creating instances of the Room class
        Room room1 = new Room("1");
        Room room2 = new Room("2");
        Room room3 = new Room("3");

        // Creating instances of the nested Light class for each room
        Room.Light light1 = room1.new Light("LED");
        Room.Light light2 = room2.new Light("Fluorescent");
        Room.Light light3 = room3.new Light("Incandescent");

        // Creating instances of the nested Closet class for each room
        Room.Closet closet1 = room1.new Closet();
        Room.Closet closet2 = room2.new Closet();
        Room.Closet closet3 = room3.new Closet();

        // Example method calls on Room objects
        room1.cleanRoom();
        room2.paint();
        room3.rearrangeFurniture();

        // Example method calls on Light objects
        light1.turnOn();
        light2.adjustBrightness();
        light3.turnOff();

        // Example method calls on Closet objects
        closet1.open();
        closet2.organizeClothes();
        closet3.close();
    }
}
