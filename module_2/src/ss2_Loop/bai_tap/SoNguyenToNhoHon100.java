package ss2_Loop.bai_tap;

public class SoNguyenToNhoHon100 {
    public static boolean laSoNguyenTo(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return n > 1;
    }

    public static void main(String[] args) {
        int n = 2;
        while (n < 100) {
            if (laSoNguyenTo(n)) {
                System.out.println(n);
            }
            n++;
        }
    }
}
