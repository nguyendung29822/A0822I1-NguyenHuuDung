package ss6_ke_thua.circle_cylinder;

public class main {
    public static void main(String[] args) {
        Circle circle = new Circle(5,"yelow");
        Cylinder cylinder = new Cylinder(6,"red",8);

        System.out.println(circle.toString());
        System.out.println(cylinder.toString());
    }
}
