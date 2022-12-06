package ss7_abstract_class_interface.bai_tap.resizeable_cho_cac_lop_hinhhoc;

public abstract class Shape implements iResizeable{
    private String color = "green";
    private boolean filled = true;

    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public static void printShape(Shape[] shape) {
        for (Shape x : shape) {
            System.out.println(x.toString());
        }
    }


}
