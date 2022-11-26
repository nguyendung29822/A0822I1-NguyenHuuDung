package ss4_class_object.bai_tap.phuong_trinh_bac_2;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double GetA() {
        return this.a;
    }

    public double GetB() {
        return this.b;
    }

    public double GetC() {
        return this.c;
    }

    public void SetA(double value) {
        this.a = value;
    }

    public void SetB(double value) {
        this.b = value;
    }

    public void SetC(double value) {
        this.c = value;
    }

    public double getDiscriminant() {
        if (a != 0) {
            return ((Math.pow(b, 2)) - 4 * a * c);
        } else {
            return -1;
        }
    }


    public double getRood1(double delta) {
        if (delta < 0) {
            return 0;
        } else {
            return (-1 * b + Math.sqrt(delta)) / 2 * a;
        }
    }

    public double getRood2(double delta) {
        if (delta < 0) {
            return 0;
        } else {
            return (-1 * b + Math.sqrt(delta)) / 2 * a;
        }
    }
}



