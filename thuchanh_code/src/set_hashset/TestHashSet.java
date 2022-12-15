package set_hashset;

import java.util.Scanner;

public class TestHashSet {
    public static void main(String[] args) {
        RutThamTrungThuong_HashSet rt = new RutThamTrungThuong_HashSet();
        Scanner sc = new Scanner(System.in);
        int choose = 0;
        do {
            System.out.println("--------------------------");
            System.out.println("-----MENU--------");
            System.out.println("mời nhập lựa chọn");
            System.out.println("1.Thêm mã số dự thưởng\n" +
                    "2.Xóa mã số dự thưởng\n" +
                    "3.Kiểm tra mã số dự thưởng có tồn tại hay không ?\n" +
                    "4.Xóa tất cả các mã dự thưởng\n" +
                    "5.Số lượng phiếu dự thưởng\n" +
                    "6.Rút thăm trúng thưởng\n" +
                    "7.In ra tất cả các phiếu\n" +
                    "8.Thoát khỏi chương trình");
            choose = sc.nextInt();
            sc.nextLine();
            if(choose==1||choose==2||choose==3){
                System.out.println("mời nhập vào mã dự thưởng :");
                String giaTri = sc.nextLine();
                if(choose==1){
                    rt.themPhieu(giaTri);
                } else if (choose==2) {
                    rt.xoaPhieu(giaTri);
                }else{
                    rt.kiemTraPhieuTonTai(giaTri);
                }
            } else if (choose==4) {
                rt.xoaTatCaCacPhieu();
            } else if (choose==5) {
                System.out.println("số lượng mã dự thưởng là :"+rt.laySoLuong());
            } else if (choose==6) {
                System.out.println("mã dự thưởng là :"+rt.rutThamMotPhieu());
            } else if (choose==7) {
                System.out.println("danh sách các mã dự thưởng là :");
                rt.inTatCa();
            }else {
                System.out.println("kết thúc");
            }
//            switch (choose) {
//                case 1:
//                case 2:
//                case 3: {
//                    System.out.println("mời nhập vào mã phiếu dự thưởng ");
//                    String giaTri = sc.nextLine();
//                    if (choose == 1) {
//                        rt.themPhieu(giaTri);
//                    } else if (choose == 2) {
//                        rt.xoaPhieu(giaTri);
//                    } else{
//                        rt.kiemTraPhieuTonTai(giaTri);
//                    }
//                }
//                case 4: {
//                    rt.xoaTatCaCacPhieu();
//                }
//                case 5: {
//                    System.out.println("số lượng mã dự thưởng là :" + rt.laySoLuong());
//                }
//                case 6: {
//                    System.out.println("mã dự thưởng là :" + rt.rutThamMotPhieu());
//                }
//                case 7: {
//                    System.out.println("các mã phiếu dự thưởng là :");
//                    rt.inTatCa();
//                }
//            }
        } while (choose != 0);
    }
}
