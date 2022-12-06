package ss7_abstract_class_interface.bai_tap.colorable_cho_cac_lop_hinhhoc;

public class Circle extends Shape {
    private double radius = 1.0;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "which is a subclass of" + super.toString() +
                '}';
    }

    @Override
    public void howToColor() {
        System.out.println("Circle: Fill the circle");
    }
}
