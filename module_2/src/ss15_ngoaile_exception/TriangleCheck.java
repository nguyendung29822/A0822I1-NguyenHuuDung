package ss15_ngoaile_exception;

public class TriangleCheck {
    public static void checkTriangle(int a, int b, int c) throws IllegalTriangleException {
        if (a + b <= c || a + c <= b || b + c <= a && a > 0 && b > 0 && c > 0) {
            throw new IllegalTriangleException("tam giác không hợp lệ !!!");
        }else{
            System.out.println("tam giác hợp lệ ");
        }
    }
}
