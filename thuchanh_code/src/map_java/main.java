package map_java;

import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        TuDien tuDien = new TuDien();
        int luaChon = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("------MENU-----");
            System.out.println("1.Thêm từ(từ khóa,ý nghĩa)\n" +
                    "2.Xóa từ\n" +
                    "3.Tra từ\n" +
                    "4.In ra danh sách từ khóa\n" +
                    "5.in ra số lượng từ\n" +
                    "6.xóa tất cả từ khóa");
            luaChon = sc.nextInt();
            sc.nextLine();
            if(luaChon==1){
                System.out.println("mời nhập vào từ khóa :");
                String tuKhoa = sc.nextLine();
                System.out.println("mời nhập vào ý nghĩa của từ khóa đó :");
                String yNghia = sc.nextLine();
                tuDien.themTu(tuKhoa,yNghia);
                System.out.println();
            } else if (luaChon==2||luaChon==3) {
                System.out.println("mời nhập vào từ khóa :");
                String tuKhoa = sc.nextLine();
                if(luaChon==2){
                    tuDien.xoaTu(tuKhoa);
                }else{
                    System.out.println("kết quả tra từ :"+tuDien.traTu(tuKhoa));
                }
            } else if (luaChon==4) {
                System.out.println("Danh sách từ khóa :");
                tuDien.inTuKhoa();
            } else if (luaChon==5) {
                System.out.println("số lượng từ khóa :"+tuDien.laySoLuong());
            } else if (luaChon==6) {
                tuDien.xoaTatCa();
            }else {
                break;
            }

        }while (luaChon!=0);

    }
}
