package ss1_Introduction.bai_tap;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("mời nhập số tiền(USD) : ");
        float usd = Float.parseFloat(scanner.nextLine());
        float vnd = usd * 23000;
        System.out.println(vnd);
    }
}
