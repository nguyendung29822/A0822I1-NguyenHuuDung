package ss3_mang_phuongthuc.bai_tap.tim_phatu_lonnhat_trong_mang2chieu;

import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số hàng: ");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập số cột: ");
        int col = Integer.parseInt(scanner.nextLine());

        int[][] array = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("nhập phần tử thứ " + i + "-" + j + ":");
                array[i][j]= Integer.parseInt(scanner.nextLine());
            }
        }
        System.out.println("mảng vừa nhập là :");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println(array[i][j]+"");
            }
            System.out.println(array);
        }
        int max = array[0][0];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(array[i][j]>max){
                    max = array[i][j];
                }
            }
        }
        System.out.println("phần tử lớn nhất trong mảng là "+max);
    }
}
