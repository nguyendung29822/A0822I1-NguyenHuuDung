package ss5_accessmodifier_static_method.bai_tap.circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Circle circle1 = new Circle();

        double tam = circle.getRadius();
        double tam1 = circle1.getRadius();

        System.out.println(tam +"");
        System.out.println(tam1 +"");

        double tam2 = circle.getArea();
        double tam3 = circle1.getArea();

        System.out.println(tam2 +"");
        System.out.println(tam3 +"");



    }

    }

