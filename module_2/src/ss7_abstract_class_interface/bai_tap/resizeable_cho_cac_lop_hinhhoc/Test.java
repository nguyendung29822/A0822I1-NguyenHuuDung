package ss7_abstract_class_interface.bai_tap.resizeable_cho_cac_lop_hinhhoc;

public class Test {
    public static void main(String[] args) {
        int y = (int) Math.floor(Math.random() * 10);
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(y,"xanh",true);
        shapes[1] = new Rectangle(y,y,"vàng",false);
        shapes[2] = new Square(y,"tím",true);
        for (Shape a : shapes) {
            System.out.println(a);
        }

        for (Shape a : shapes) {
            a.resize(Math.random() * 1000);
        }
        System.out.println();
        Shape.printShape(shapes);
    }

    }

