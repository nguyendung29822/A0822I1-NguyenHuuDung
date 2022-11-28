package ss6_ke_thua.triangle_shape;

public class Shape {
    private double side = 0.0;
    private String color = "black";

    public Shape(String color) {
    }

    public Shape(double side, String color) {
        this.side = side;
        this.color = color;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "(" + getSide() + "," + getColor() + ")";
    }
}
