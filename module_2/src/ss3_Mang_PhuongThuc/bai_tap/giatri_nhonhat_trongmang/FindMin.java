package ss3_Mang_PhuongThuc.bai_tap.giatri_nhonhat_trongmang;

import java.util.Scanner;

public class FindMin {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số phần tử vào mảng :");
        int n = Integer.parseInt(scanner.nextLine());
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("phần tử thứ : "+(i+1));
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(array);

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i]<min){
                min = array[i];
            }
        }
        System.out.println("giá trị nhỏ nhất của mảng là :"+min);

    }


}
