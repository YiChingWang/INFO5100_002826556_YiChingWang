public class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }

    public void printSideLength() {
        System.out.println("Side length: " + this.getWidth());
    }
    @Override
    public String getName() {
        return "Square";
    }
}

