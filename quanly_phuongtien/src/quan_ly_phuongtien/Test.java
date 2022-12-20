package quan_ly_phuongtien;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DanhSachPhuongTien phuongTien = new DanhSachPhuongTien();
        System.out.println("CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG");
        System.out.println("Chọn Chức Năng :");
        System.out.println("---------------------------------------------");
        int choise = 0;
        do {
            System.out.println("1. Thêm mới phương tiện.\n" +
                    "2. Hiện thị phương tiện\n" +
                    "3. Xóa phương tiện\n" +
                    "4. Tìm kiếm theo biển kiểm soát\n" +
                    "5. Thoát\n");
            choise = scanner.nextInt();
            scanner.nextLine();
            if(choise==1){
                System.out.println("1.1.Xe Tải\n"+
                        "1.2.Xe Ô Tô\n"+
                        "1.3.Xe Máy\n");
                choise = scanner.nextInt();
                scanner.nextLine();
                switch (choise){
                    case 1:
                        System.out.println("mời nhập thông tin xe tải :----------");
                        System.out.println("mời nhập biển kiểm soát :");
                        String bienKiemSoat = scanner.nextLine();
                        System.out.println("mời nhập tên hãng sản xuất :");
                        //HangSanXuat hangSanXuat = new HangSanXuat();
                        HangSanXuat tenHangSanXuat = new HangSanXuat();

                        String tenHangSanXuat1 = scanner.nextLine();
                        System.out.println("mời nhập năm sản xuất :");
                        int namSanXuat = scanner.nextInt();
                        System.out.println("mời nhập chủ sở hữu :");
                        String chuSoHuu = scanner.nextLine();
                        scanner.nextLine();
                        System.out.println("mời nhập vào trọng tải :");
                        String trongTai = scanner.nextLine();
                        PhuongTien phuongTien1 = new PhuongTien(bienKiemSoat,tenHangSanXuat,namSanXuat,chuSoHuu,trongTai);
                        phuongTien.themPhuongTien(phuongTien1);
//                    case 2 :
//                        System.out.println("mời nhập vào thông tin xe ô tô :--------");
//                        System.out.println();

                }
            }
        }while (choise!=0);
    }
}
