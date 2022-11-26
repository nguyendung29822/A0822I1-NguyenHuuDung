package ss6_ke_thua.circle_cylinder;

public class Circle {
    private double radius;
    private String color;
    private double area;
    final double PI = 3.14;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double area(){
        return this.radius *2 *PI;
    }

    public String toString(){
        return "hình tròn có bán kính là :"+getRadius()+"có màu sắc là :"+getColor();
    }
}
