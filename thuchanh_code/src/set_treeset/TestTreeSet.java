package set_treeset;

import java.util.Scanner;

public class TestTreeSet {
    public static void main(String[] args) {
        RutThamTrungThuong_TreeSet rt = new RutThamTrungThuong_TreeSet();
        Scanner sc = new Scanner(System.in);
        int choose = 0;
        do {
            System.out.println("------------------------------------------");
            System.out.println("------------------MENU--------------------");
            System.out.println("mời chọn chức năng");
            System.out.println("1.thêm mã dự thưởng\n"+
                    "2.xóa mã dự thưởng\n"+
                    "3.kiểm tra mã số dự thưởng có tồn tại hay không\n"+
                    "4.xóa tất cả các mã dự thưởng\n"+
                    "5.số lượng phiếu dự thưởng\n"+
                    "6.rút thăm trúng thưởng\n"+
                    "7.in ra tất cả các phiếu\n"+
                    "8.thoát khỏi chương trình");
            choose = sc.nextInt();
            sc.nextLine();
            if(choose==1||choose==2||choose==3){
                System.out.println("mời nhập vào giá trị");
                String giaTri = sc.nextLine();
                if(choose==1){
                    rt.themPhieu(giaTri);
                } else if (choose==2) {
                    rt.xoaPhieu(giaTri);
                } else{
                    rt.kiemTraMaTonTai(giaTri);
                }
            } else if (choose==4) {
                rt.xoaTatCaMaDuthuong();
            } else if (choose==5) {
                rt.soLuongPhieuDuThuong();
            } else if (choose==6) {
                rt.rutThamMotPhieu();
            } else if (choose==7) {
                System.out.println("danh sách mã dự thưởng là :");
                rt.inTatCaMa();
            }else{
                System.out.println("kết thúc");
            }
        }while (choose!=0);
    }

}
