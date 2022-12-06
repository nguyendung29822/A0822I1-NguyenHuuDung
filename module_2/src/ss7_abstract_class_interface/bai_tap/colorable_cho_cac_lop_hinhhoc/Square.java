package ss7_abstract_class_interface.bai_tap.colorable_cho_cac_lop_hinhhoc;

public class Square extends Shape{
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public Square() {
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                "which is a subclass of" + super.toString() +
                '}';
    }

    @Override
    public void howToColor() {
        System.out.println("Square : Fill the square");
    }
}
