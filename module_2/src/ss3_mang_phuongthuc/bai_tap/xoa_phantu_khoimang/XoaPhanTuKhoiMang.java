package ss3_mang_phuongthuc.bai_tap.xoa_phantu_khoimang;


import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    static void addArray(int[] arr, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("mời nhập phân tử thứ " + (i + 1));
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
    }

    static void displayArray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "");
        }
    }

    static int checkElement(int[] arr, int n, int number) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == number) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[100];
        System.out.println("mời nhập số phần tử trong mảng: ");
        int n = Integer.parseInt(scanner.nextLine());
        addArray(arr, n);
        displayArray(arr, n);
        System.out.println("\nNhập số cần xóa: ");
        int number = Integer.parseInt(scanner.nextLine());
        int check = checkElement(arr, n, number);
        if (check == -1) {
            System.out.println("Phần tử không có trong mảng!");
        } else {
            for (int i = check; i < n; i++) {
                arr[i] = arr[i + 1];
            }
            System.out.println("Mảng sau khi xóa phần tử là: ");
            displayArray(arr, n);
        }

    }
}
