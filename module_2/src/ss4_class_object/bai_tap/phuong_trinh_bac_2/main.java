package ss4_class_object.bai_tap.phuong_trinh_bac_2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a,b,c;
        System.out.println("a = ");
        a = Double.parseDouble(scanner.nextLine());
        System.out.println("b =");
        b = Double.parseDouble(scanner.nextLine());
        System.out.println("c = ");
        c = Double.parseDouble(scanner.nextLine());
        QuadraticEquation f = new QuadraticEquation(a, b, c);
        if (f.getDiscriminant() > 0) {
            System.out.println("phuong trình có 2 nghiệm ");
            System.out.println("nghiệm 1: " + f.getRood1(f.getDiscriminant()));
            System.out.println("nghiệm 2: " + f.getRood2(f.getDiscriminant()));
        } else if (f.getDiscriminant() == 0) {
            System.out.println("phuong trinh có nghiệm kép");
            System.out.println("nghiệm kép là :" + f.getRood1(f.getDiscriminant()));
        } else {
            System.out.println("phuong trình vô nghiệm");
        }
    }
}

