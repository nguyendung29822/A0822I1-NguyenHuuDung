package ss3_Mang_PhuongThuc.bai_tap.Gop_Mang;

import java.util.Arrays;
import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("mời nhập số lượng phần tử mảng 1: ");
        int a = Integer.parseInt(scanner.nextLine());
        int[] mang1 = new int[a];
        for (int i = 0; i < a; i++) {
            System.out.println("nhập phần tử thứ " + (i + 1));
            mang1[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("mời nhập số lượng phần tử mảng 2: ");
        int b = Integer.parseInt(scanner.nextLine());
        int[] mang2 = new int[b];
        for (int i = 0; i < b; i++) {
            System.out.println("nhập phần tử thứ " + (i + 1));
            mang2[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("mang1 :" + Arrays.toString(mang1));
        System.out.println("mang2 :" + Arrays.toString(mang2));

        int[] mang3 = new int[mang1.length + mang2.length];
        for (int i = 0; i < mang1.length; i++) {
            mang3[i] = mang1[i];
        }
        for (int j = 0; j < mang2.length; j++) {
            mang3[j + mang1.length] = mang2[j];
        }
        System.out.println("mang3 "+Arrays.toString(mang3));

    }

}
