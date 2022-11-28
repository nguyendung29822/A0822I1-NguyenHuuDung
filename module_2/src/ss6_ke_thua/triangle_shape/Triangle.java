package ss6_ke_thua.triangle_shape;

public class Triangle extends Shape {
    private double side1 = 0.0;
    private double side2 = 0.0;
    private double side3 = 0.0;

    final double H = 4.0;

    public Triangle(String color, double side1, double side2, double side3) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(double side, String color, double side1, double side2, double side3) {
        super(side, color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getArea() {
        return (getSide1() * H) / 2;
    }

    public double getPerimeter() {
        return getSide1() + getSide2() + getSide3();
    }

    public String toString() {
        return "(" + getArea() + "," + getPerimeter() + "," + getColor() + ")";
    }
}
