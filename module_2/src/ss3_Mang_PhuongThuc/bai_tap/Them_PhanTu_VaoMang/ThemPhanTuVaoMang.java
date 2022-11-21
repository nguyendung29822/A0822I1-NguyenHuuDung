package ss3_Mang_PhuongThuc.bai_tap.Them_PhanTu_VaoMang;

import java.util.Scanner;


public class ThemPhanTuVaoMang {
    public static void addArray(int[] array, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("mời nhập phần tử thứ " + (i + 1));
            array[i] = Integer.parseInt(scanner.nextLine());
        }
    }

    public static void displayArray(int[] array, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(array[i] + "");
        }
    }

    public static int[] addElement(int[] array, int n, int number, int index) {
        int[] newArray = new int[n + 1];
        newArray[index] = number;
        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }
        for (int i = index; i < n + 1; i++) {
            newArray[i] = array[i - 1];
        }
        return newArray;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[100];
        System.out.println("mời nhập số phần tử trong mảng: ");
        int n = Integer.parseInt(scanner.nextLine());
        addArray(array, n);
        displayArray(array, n);
        System.out.println("Bạn muốn thêm số ở vị trí nào? ");
        int index = Integer.parseInt(scanner.nextLine());
        if (index < 0 || index >= array.length) {
            System.out.println("Không chèn được phần tử vào mảng!!!");
        } else {
            System.out.println("Nhập số bạn muốn chèn vào: ");
            int number = Integer.parseInt(scanner.nextLine());
            int[] newArray = addElement(array, n, number, index);
            displayArray(newArray, n + 1);
        }
    }
}


