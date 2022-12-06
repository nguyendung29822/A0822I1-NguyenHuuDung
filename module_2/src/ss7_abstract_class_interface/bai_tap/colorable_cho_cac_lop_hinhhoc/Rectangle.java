package ss7_abstract_class_interface.bai_tap.colorable_cho_cac_lop_hinhhoc;

public class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                "which is a subclass of" + super.toString() +
                '}';
    }

    @Override
    public void howToColor() {
        System.out.println("Rectangle: Fill the Rectangle");
    }
}
