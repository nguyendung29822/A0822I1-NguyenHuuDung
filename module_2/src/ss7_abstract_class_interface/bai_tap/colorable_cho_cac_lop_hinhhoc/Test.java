package ss7_abstract_class_interface.bai_tap.colorable_cho_cac_lop_hinhhoc;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("yellow",true,12);
        shapes[1] = new Rectangle("greed",true,11,8);
        shapes[2] = new Square("red",false,5);
        for (Shape x:shapes) {
            System.out.println(x);
        }
        Shape.printShape(shapes);

    }
}
