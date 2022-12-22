package ss15_ngoaile_exception;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TriangleCheck check1 = new TriangleCheck();
        Triangle triangle = new Triangle();
        boolean check = false;
        do {
            try {
                check = false;
                System.out.println("nhập vào cạnh a :");
                int a = Integer.parseInt(scanner.nextLine());
                System.out.println("nhập vào cạnh b :");
                int b = Integer.parseInt(scanner.nextLine());
                System.out.println("nhập vào cạnh c :");
                int c = Integer.parseInt(scanner.nextLine());
                try {
                    check1.checkTriangle(a,b,c);
                }catch (IllegalTriangleException e){
                    throw new RuntimeException(e);
                }
            } catch (Exception e) {
                System.out.println("không đúng định dạng");
            }
        } while (check);
    }

}

