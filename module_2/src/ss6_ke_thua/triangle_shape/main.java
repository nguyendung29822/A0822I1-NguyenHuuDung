package ss6_ke_thua.triangle_shape;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shape shape1 = new Triangle("yellow",1,4,6);
        Shape shape2 = new Triangle("red",3,7,6);
        Shape shape3 = new Triangle("pink",4,4,9);

        System.out.println(shape1.toString());
        System.out.println(shape2.toString());
        System.out.println(shape3.toString());


        ((Triangle)shape1).setColor("red");
        ((Triangle)shape2).setColor("pink");
        ((Triangle)shape3).setColor("yellow");

        System.out.println(((Triangle)shape1).toString());
        System.out.println(((Triangle)shape2).toString());
        System.out.println(((Triangle)shape3).toString());








    }
}
