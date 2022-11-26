package ss5_accessmodifier_static_method.bai_tap.circle;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    final double PI = 3.14;

    public Circle(){}
    public Circle(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public double getArea(){
        return Math.pow(radius,2)*PI;
    }



}
