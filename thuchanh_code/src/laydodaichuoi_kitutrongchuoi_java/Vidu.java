package laydodaichuoi_kitutrongchuoi_java;

import java.util.Scanner;

public class Vidu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s;
        System.out.println("nhập vào chuỗi :");
        s = scanner.nextLine();
        System.out.println("-----");

        //hàm length => lấy ra được độ dài của chuỗi
        System.out.println(s.length());
        int doDai = s.length();
        //hàm CharAt(vị trí) => lấy ra 1 kí tự tại vị trí
        for (int i = 0; i < doDai; i++) {
            System.out.println("vị trí : " + i + "là :" + s.charAt(i));
        }

        // hàm getChars(vị trí bắt đầu, vị trí kết thúc-1, mảng lưu dữ liệu,
        //vị trí bắt đầu lưu của mảng)
        char[] arrayChar = new char[100];
        s.getChars(1, 4, arrayChar, 0);
        for (int i = 0; i < arrayChar.length; i++) {
            System.out.println("giá trị của mảng tại :" + i + "là :" + arrayChar[i]);
        }
        // getBytes => có 3 cách lấy ra giá trị của các kí tự thành 1 mảng
        byte[] arrayBytes = s.getBytes();
        for (byte b : arrayBytes) {
            System.out.println(b);

        }


    }

}
