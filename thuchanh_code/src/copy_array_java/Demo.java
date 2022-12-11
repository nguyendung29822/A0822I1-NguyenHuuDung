package copy_array_java;

import java.util.Arrays;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("nhập vào số phần tử của mảng :");
//        int n = Integer.parseInt(scanner.nextLine());
//        int[] newArray = new int[n];
//        for (int i = 0; i < n; i++) {
//            System.out.println("phần tử thứ "+(i+1));
//            newArray[i] = Integer.parseInt(scanner.nextLine());
//        }
//        System.out.println(newArray);
        int[] mang1 = {1, 2, 3, 4};
        // copy mảng cách 1

        int[] mang1_a = mang1;
        mang1_a[0] = 4;
        System.out.println("Mảng 1: " + Arrays.toString(mang1));
        System.out.println("Mảng 1_a: " + Arrays.toString(mang1_a));

        // cách 2 dùng hàm clone

        int[] mang1_b = mang1.clone();
        mang1_a[0] = 6;
        System.out.println("mang 1_b: " + Arrays.toString(mang1_a));


        // cách 3 -system.arraycopy
        int[] mang1_c = new int[mang1.length];
        System.arraycopy(mang1,0,mang1_c,0,mang1.length);
        System.out.println("mang1_c: "+Arrays.toString(mang1_c));

    }
}
